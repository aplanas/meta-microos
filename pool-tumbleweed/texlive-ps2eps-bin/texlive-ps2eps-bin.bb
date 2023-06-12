SUMMARY = "Binary files of ps2eps"
DESCRIPTION = "Binary files of ps2eps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn62210"

RPM_NAME = "texlive-ps2eps-bin-2023.20230311.svn62210-91.1.aarch64.rpm"
RPM_HASH = "46d498b91cc58a56d4b2497032334d18c602c3b1038d9e6c694bd422ec6cd9a4ad4fc536b714c2005233a41c6aa823714586bd4c52d4ec333c9eb174778b370a"

RPROVIDES:${PN} += "texlive-ps2eps-bin \
texlive-ps2eps-bin(aarch-64) \
texlive-pstools-bin:/usr/bin/bbox \
texlive-pstools-bin:/usr/bin/ps2eps"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
texlive-ps2eps"

inherit rpm
