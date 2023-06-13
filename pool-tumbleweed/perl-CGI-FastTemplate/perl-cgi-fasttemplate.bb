SUMMARY = "Perl extension for managing templates, and performing variable interpolation"
DESCRIPTION = "CGI::FastTemplate manages templates and parses templates replacing \
variable names with values. It was designed for mid to large scale \
web applications (CGI, mod_perl) where there are great benefits to \
separating the logic of an application from the specific \
implementation details."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.09"

RPM_NAME = "perl-CGI-FastTemplate-1.09-21.17.noarch.rpm"
RPM_HASH = "561234436aac0292e9e8d86e8233277a0b0921a75cc448c11d9edfa017e676b4dcb6fcd0ae1e4e32cb11649899a78504ec446f705d7e5651960ccbf0a7d1bda2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(CGI::FastTemplate) \
perl-CGI-FastTemplate"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
