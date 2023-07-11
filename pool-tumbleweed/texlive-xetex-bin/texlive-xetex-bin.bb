SUMMARY = "Binary files of xetex"
DESCRIPTION = "Binary files of xetex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-xetex-bin-2023.20230311.svn66084-92.1.aarch64.rpm"
RPM_HASH = "740280428109e6e85e77960f580ea34648412d2d84160c407850c43501585d1ba0af8a741b0d2b832702499bfed83f8d6bca18bae8a94c6c10994d2636952bc3"

RPROVIDES:${PN} += "texlive-xetex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgraphite2.so.3 \
libharfbuzz.so.0 \
libicuuc.so.73 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
texlive-xetex"

inherit rpm
