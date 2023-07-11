SUMMARY = "Perl extension for managing templates, and performing variable interpolation"
DESCRIPTION = "CGI::FastTemplate manages templates and parses templates replacing \
variable names with values. It was designed for mid to large scale \
web applications (CGI, mod_perl) where there are great benefits to \
separating the logic of an application from the specific \
implementation details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.09"

RPM_NAME = "perl-CGI-FastTemplate-1.09-21.18.noarch.rpm"
RPM_HASH = "08471b67f78ca600242cff0935399d496be0196b4009648cfff003e28881804ffa94a096a6546428f8b2c2556a8bb485337a04e2591404005ce125bdd43018ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CGI--FastTemplate \
perl-CGI-FastTemplate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
