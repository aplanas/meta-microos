SUMMARY = "ANSI Terminal Escape Code Converter"
DESCRIPTION = "Ansifilter handles text files containing ANSI terminal escape codes. \
The command sequences may be stripped or be interpreted to generate formatted \
output (HTML, RTF, TeX, LaTeX, BBCode)."
LICENSE = "GPL-3.0-or-later"

PV = "2.20"

RPM_NAME = "ansifilter-2.20-1.1.aarch64.rpm"
RPM_HASH = "66c6a9806f84eef80aaffda79f26ac9dcbba73c894b10fbd8b61438902f7392af44036a49db9ed4c90cd87386e3e7de384d5dd24ba02757a8878fa5cb8517e5b"

RPROVIDES:${PN} += "ansifilter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
