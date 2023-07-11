SUMMARY = "Binary files of mflua"
DESCRIPTION = "Binary files of mflua"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-mflua-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "6de2b211a69b65caa24261339062707d3fe7feba73df7cae6a3d2427ae975d86034f1e87850061c62716f0280fd75ac623fbf6da75d8a9ae26e4f6b1fd5b2f8c"

RPROVIDES:${PN} += "texlive-mflua-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXt.so.6 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
libpotrace.so.0 \
libtexlua53.so.5 \
libtexluajit.so.2 \
texlive-mflua"

inherit rpm
