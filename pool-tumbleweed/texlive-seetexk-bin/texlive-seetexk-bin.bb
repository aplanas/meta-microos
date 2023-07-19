SUMMARY = "Binary files of seetexk"
DESCRIPTION = "Binary files of seetexk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-seetexk-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "cfb4665d48fcc741033983dd47fb896485ea9df7bbf5d2cac0987e13186fcdd80d247989d870e5a8f6b2c2d3c8ced87bf65249169fad9867e2e8160605ab8faf"

RPROVIDES:${PN} += "texlive-seetexk-bin"

RDEPENDS:${PN} += "/usr/bin/csh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-seetexk"

inherit rpm
