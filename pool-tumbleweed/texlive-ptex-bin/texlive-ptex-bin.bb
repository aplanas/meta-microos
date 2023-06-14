SUMMARY = "Binary files of ptex"
DESCRIPTION = "Binary files of ptex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-ptex-bin-2023.20230311.svn66084-91.1.aarch64.rpm"
RPM_HASH = "0a13afbcd47e9e768dc05e8d551f536164ec8e7b4c72b3e7dfe5e95aa1c14c72eb4203e1a1d0ac95343d5a52f80c3d4c7c9041eb319895ab975cae49f3273d4e"

RPROVIDES:${PN} += "texlive-ptex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libkpathsea.so.6 \
libm.so.6 \
libmpfr.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libptexenc.so.1 \
libz.so.1 \
texlive-ptex"

inherit rpm
