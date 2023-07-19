SUMMARY = "Binary files of ttfutils"
DESCRIPTION = "Binary files of ttfutils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ttfutils-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "96d725ffcaf21d23b29923f9d794ee262124287b622f6d17b6b1713cac0ba4a0d05b40417a2ca2bae6cdbc645acbee23000ea0910b44e6d29b37205b5a5a1b58"

RPROVIDES:${PN} += "texlive-ttfutils-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-ttfutils"

inherit rpm
