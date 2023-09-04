SUMMARY = "Simple support for XML Namespaces"
DESCRIPTION = "This module implements a simple object for representing XML Namespaces in \
Perl. It provides little more than some syntactic sugar for your Perl \
programs, saving you the bother of typing lots of long-winded URIs. It was \
inspired by the Class::RDF::NS module distributed as part of Class::RDF."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-XML-Namespace-0.02-1.28.noarch.rpm"
RPM_HASH = "1f8e5d27f157b964f00826b2ba4ea4d24ae676dc0b21e91a845e6d9a73ead21ac7dfc4d311d8c497d60880068e06300241da8cef8b8574b1ad6a09fc93497aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Namespace \
perl-XML-Namespace"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
