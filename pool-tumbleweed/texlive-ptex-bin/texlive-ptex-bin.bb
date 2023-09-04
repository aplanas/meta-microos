SUMMARY = "Binary files of ptex"
DESCRIPTION = "Binary files of ptex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-ptex-bin-2023.20230311.svn66084-93.2.aarch64.rpm"
RPM_HASH = "f49f95996bf15c5b25c914e2602161e5af1684a3b4a6c628e6c8ee93b1552f30749d437e27d7e650c19be09f83b4edfa56d65bce2d55b1e858c3afb6d3fd6030"

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
