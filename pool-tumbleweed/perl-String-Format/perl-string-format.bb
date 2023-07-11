SUMMARY = "Sprintf-Like String Formatting Capabilities With"
DESCRIPTION = "String::Format lets you define arbitrary printf-like format sequences to be \
expanded. This module would be most useful in configuration files and \
reporting tools, where the results of a query need to be formatted in a \
particular way. It was inspired by mutt's index_format and related \
directives (see \
<URL:http://www.mutt.org/doc/manual/manual-6.html#index_format>)."
LICENSE = "GPL-2.0-only"

PV = "1.18"

RPM_NAME = "perl-String-Format-1.18-1.18.noarch.rpm"
RPM_HASH = "a9c923f11a534d3ab6c25a4891374153aaa8175a120e488bd6ff79c1f5e22c871e08a8fc08f5b419fa7220d3eaf3f81f6381e17830f996e408fafb403f1d2857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Format \
perl-String-Format"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
