SUMMARY = "Universal Source Code to Formatted Text Converter"
DESCRIPTION = "A utility that converts sourcecode to HTML, XHTML, RTF, LaTeX, TeX, XML or ANSI \
escape sequences with syntax highlighting. \
It supports several programming and markup languages. \
Language descriptions are configurable and support regular expressions. \
The utility offers indentation and reformatting capabilities. \
It is easily possible to create new language definitions and colour themes."
LICENSE = "GPL-3.0-or-later"

PV = "4.6"

RPM_NAME = "highlight-4.6-1.1.aarch64.rpm"
RPM_HASH = "0c616b5c7972680c170ef0d4e703b8bec7c3618c653b819b7bc6f2c2f855258cbd65e306ff68eee1fe76daa98afee69f0afa25f32216c02a2dea5521cbba5bc0"

RPROVIDES:${PN} += "highlight \
highlight(aarch-64)"

RDEPENDS:${PN} += "highlight-common \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
liblua5.4.so.5()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
