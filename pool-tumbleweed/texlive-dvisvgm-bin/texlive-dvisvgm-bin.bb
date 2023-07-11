SUMMARY = "Binary files of dvisvgm"
DESCRIPTION = "Binary files of dvisvgm"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66547"

RPM_NAME = "texlive-dvisvgm-bin-2023.20230311.svn66547-92.1.aarch64.rpm"
RPM_HASH = "7b636f6022ab3f57b19983332faa33989330f3b8409628341b1ed57468b674e8b3d3e2cb6a27f4471f900ddf01b7feaba6345295ee736f2557a56174beb3f9a2"

RPROVIDES:${PN} += "texlive-dvisvgm-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgs.so.9 \
libkpathsea.so.6 \
libm.so.6 \
libpotrace.so.0 \
libstdc++.so.6 \
libz.so.1 \
texlive-dvisvgm"

inherit rpm
