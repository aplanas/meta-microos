SUMMARY = "Simple support for XML Namespaces"
DESCRIPTION = "This module implements a simple object for representing XML Namespaces in \
Perl. It provides little more than some syntactic sugar for your Perl \
programs, saving you the bother of typing lots of long-winded URIs. It was \
inspired by the Class::RDF::NS module distributed as part of Class::RDF."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-XML-Namespace-0.02-1.27.noarch.rpm"
RPM_HASH = "431538fab2fc873dcc3464a4dccb022dc775dc0bb899295d726045c3826f84fac294169e67ee65d25d3a78d6dc655936e9e1a15012e04c657636548fe6de6ccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Namespace \
perl-XML-Namespace"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
