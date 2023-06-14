SUMMARY = "Simple support for XML Namespaces"
DESCRIPTION = "This module implements a simple object for representing XML Namespaces in \
Perl. It provides little more than some syntactic sugar for your Perl \
programs, saving you the bother of typing lots of long-winded URIs. It was \
inspired by the Class::RDF::NS module distributed as part of Class::RDF."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-XML-Namespace-0.02-1.26.noarch.rpm"
RPM_HASH = "256e77b31d0c4a32c4f4671f99b462bfb3db0fb49eb97c18ad1059ff787fd4e9517020647821ff4941850695d919f8d6865e2aa20cba98e97adc5c0fba9c8f4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Namespace \
perl-XML-Namespace"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
