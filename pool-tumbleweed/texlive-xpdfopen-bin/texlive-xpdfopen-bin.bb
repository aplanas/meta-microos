SUMMARY = "Binary files of xpdfopen"
DESCRIPTION = "Binary files of xpdfopen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-xpdfopen-bin-2023.20230311.svn62210-91.1.aarch64.rpm"
RPM_HASH = "55d5eb9bb941b501449e9f7ba56ce7a71a47a896addc95045d29da890b6c389dfcdf42f0ea479a68f165ae3f6c96d681ddf1384cdecd7bf2a6ef5dab4ea427f5"

RPROVIDES:${PN} += "texlive-xpdfopen-bin \
texlive-xpdfopen-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
texlive-xpdfopen"

inherit rpm
