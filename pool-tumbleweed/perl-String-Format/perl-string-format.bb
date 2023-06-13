SUMMARY = "Sprintf-Like String Formatting Capabilities With"
DESCRIPTION = "String::Format lets you define arbitrary printf-like format sequences to be \
expanded. This module would be most useful in configuration files and \
reporting tools, where the results of a query need to be formatted in a \
particular way. It was inspired by mutt's index_format and related \
directives (see \
<URL:http://www.mutt.org/doc/manual/manual-6.html#index_format>)."
LICENSE = "GPL-2.0-only"

PV = "1.18"

RPM_NAME = "perl-String-Format-1.18-1.17.noarch.rpm"
RPM_HASH = "08fd6e39bb8e4fdbe8d1c82e164c0719509f9b03599bfdce02f2e6938004ca288a2dd1cce9653cc22d25c6235979d4f558788485d5a924c2738cffc06ca652d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(String::Format) \
perl-String-Format"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
