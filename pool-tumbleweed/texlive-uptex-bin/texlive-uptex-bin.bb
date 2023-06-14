SUMMARY = "Binary files of uptex"
DESCRIPTION = "Binary files of uptex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66382"

RPM_NAME = "texlive-uptex-bin-2023.20230311.svn66382-91.1.aarch64.rpm"
RPM_HASH = "ec830b32b4a860f1d3d6de7d64d3ad5ef3ae5cedd97940106a429aed934dda2d18b4521c0940cd9534ac1de427e435d0500803a289ef9ade9cb2f9a7154821e6"

RPROVIDES:${PN} += "texlive-uptex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libkpathsea.so.6 \
libm.so.6 \
libmpfr.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libptexenc.so.1 \
libz.so.1 \
texlive-uptex"

inherit rpm
