SUMMARY = "Binary files of dvipdfmx"
DESCRIPTION = "Binary files of dvipdfmx"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-dvipdfmx-bin-2023.20230311.svn65877-91.1.aarch64.rpm"
RPM_HASH = "a50eb50ba3ce560e6aac10c9e7f83ee3cb2490dd9394eb60860ab23f6e04fb707e153411f9bd7d688438a1df32a3e1c9a7e027daec2e5fad9d5e0c9807fd4278"

RPROVIDES:${PN} += "texlive-dvipdfm-bin \
texlive-dvipdfmx-bin \
texlive-dvipdfmx-bin(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkpathsea.so.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpaper.so.2()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libz.so.1()(64bit) \
texlive-dvipdfmx \
texlive-scripts \
texlive-xetex-bin"

inherit rpm
