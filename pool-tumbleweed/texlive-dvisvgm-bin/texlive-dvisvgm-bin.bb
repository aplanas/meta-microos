SUMMARY = "Binary files of dvisvgm"
DESCRIPTION = "Binary files of dvisvgm"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66547"

RPM_NAME = "texlive-dvisvgm-bin-2023.20230311.svn66547-93.2.aarch64.rpm"
RPM_HASH = "ac75fac0d706e488cbf6799044822899d9ca476d19fc53b8553fb7de7a0759cba1852e9a1d6ab0baa831509ce1ed4e63ac228a8ebae9b7aaa90daa382073e1ee"

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
