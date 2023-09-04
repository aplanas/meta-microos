SUMMARY = "Perl extension for managing templates, and performing variable interpolation"
DESCRIPTION = "CGI::FastTemplate manages templates and parses templates replacing \
variable names with values. It was designed for mid to large scale \
web applications (CGI, mod_perl) where there are great benefits to \
separating the logic of an application from the specific \
implementation details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.09"

RPM_NAME = "perl-CGI-FastTemplate-1.09-21.19.noarch.rpm"
RPM_HASH = "d2449e449baacb3b94a61434650c0d6a1e0ab04a1472a5f7399d28e77b2bac7fdcd7a9b89c3789a9575ce4132e153825e5b17af95d30b157df3f467dfe3c57a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CGI--FastTemplate \
perl-CGI-FastTemplate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
