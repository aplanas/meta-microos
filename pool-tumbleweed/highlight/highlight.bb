SUMMARY = "Universal Source Code to Formatted Text Converter"
DESCRIPTION = "A utility that converts sourcecode to HTML, XHTML, RTF, LaTeX, TeX, XML or ANSI \
escape sequences with syntax highlighting. \
It supports several programming and markup languages. \
Language descriptions are configurable and support regular expressions. \
The utility offers indentation and reformatting capabilities. \
It is easily possible to create new language definitions and colour themes."
LICENSE = "GPL-3.0-or-later"

PV = "4.7"

RPM_NAME = "highlight-4.7-1.1.aarch64.rpm"
RPM_HASH = "52502a48835cffcdb549b08422b328f6160a5b63b2f8f3d506669cb9737773dacc08d3e325c9fb9523877533fff60c88f04d351816534664207ab9dedfc2db61"

RPROVIDES:${PN} += "highlight"

RDEPENDS:${PN} += "highlight-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6"

inherit rpm
