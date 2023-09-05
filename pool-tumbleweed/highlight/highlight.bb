SUMMARY = "Universal Source Code to Formatted Text Converter"
DESCRIPTION = "A utility that converts sourcecode to HTML, XHTML, RTF, LaTeX, TeX, XML or ANSI \
escape sequences with syntax highlighting. \
It supports several programming and markup languages. \
Language descriptions are configurable and support regular expressions. \
The utility offers indentation and reformatting capabilities. \
It is easily possible to create new language definitions and colour themes."
LICENSE = "GPL-3.0-or-later"

PV = "4.8"

RPM_NAME = "highlight-4.8-1.1.aarch64.rpm"
RPM_HASH = "fe7f0e89e0ce5f730dd264a4f51b55b3169ed7d921e67634613ee7d82be5512ef12b4b7b090cb7bcf1ec19b84244d86079ee392483d325c4249b0b1e49eb345c"

RPROVIDES:${PN} += "highlight"

RDEPENDS:${PN} += "highlight-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6"

inherit rpm
