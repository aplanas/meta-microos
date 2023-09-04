SUMMARY = "Sprintf-Like String Formatting Capabilities With"
DESCRIPTION = "String::Format lets you define arbitrary printf-like format sequences to be \
expanded. This module would be most useful in configuration files and \
reporting tools, where the results of a query need to be formatted in a \
particular way. It was inspired by mutt's index_format and related \
directives (see \
<URL:http://www.mutt.org/doc/manual/manual-6.html#index_format>)."
LICENSE = "GPL-2.0-only"

PV = "1.18"

RPM_NAME = "perl-String-Format-1.18-1.19.noarch.rpm"
RPM_HASH = "e647039b58605c853ca3d2320d61d19b8c85ba3e2e3fc898927fdb27d33e57da90ce23fb331b736945715f563407b7604119a62c9c7b37d97bc0822a14281a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Format \
perl-String-Format"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
