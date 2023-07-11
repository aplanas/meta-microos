SUMMARY = "Binary files of ttfutils"
DESCRIPTION = "Binary files of ttfutils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-ttfutils-bin-2023.20230311.svn65877-92.1.aarch64.rpm"
RPM_HASH = "5eb06a8b9ddee7f740f2913e8c10f1f2d430873d51a1d5b5a72759fb500abd29b9d3a2948e56ce810bcbc83e397346f0327d9eaf56778e77aa62162270cc28d8"

RPROVIDES:${PN} += "texlive-ttfutils-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-ttfutils"

inherit rpm
