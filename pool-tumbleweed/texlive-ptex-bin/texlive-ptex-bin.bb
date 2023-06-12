SUMMARY = "Binary files of ptex"
DESCRIPTION = "Binary files of ptex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-ptex-bin-2023.20230311.svn66084-91.1.aarch64.rpm"
RPM_HASH = "0a13afbcd47e9e768dc05e8d551f536164ec8e7b4c72b3e7dfe5e95aa1c14c72eb4203e1a1d0ac95343d5a52f80c3d4c7c9041eb319895ab975cae49f3273d4e"

RPROVIDES:${PN} += "texlive-ptex-bin \
texlive-ptex-bin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libkpathsea.so.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpfr.so.6()(64bit) \
libpixman-1.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libptexenc.so.1()(64bit) \
libz.so.1()(64bit) \
texlive-ptex"

inherit rpm
