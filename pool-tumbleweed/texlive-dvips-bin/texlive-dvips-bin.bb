SUMMARY = "Binary files of dvips"
DESCRIPTION = "Binary files of dvips"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvips-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "46709e0e9935b1b9ff30add30360f619f53d966e73dcc1e925363609e638a4e8114f3edee14b83d3795e7a347876bd72757809921b72eb80b19199c3f3c3856e"

RPROVIDES:${PN} += "texlive-dvips-bin \
texlive-dvips-bin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
texlive-dvips"

inherit rpm
