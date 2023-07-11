SUMMARY = "Binary files of uptex"
DESCRIPTION = "Binary files of uptex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66382"

RPM_NAME = "texlive-uptex-bin-2023.20230311.svn66382-92.1.aarch64.rpm"
RPM_HASH = "ec30682a63b26d094b2c813af74cdce65706e4f123a90dce7d345a5f4396dcbc610d4d6a5bad80d075379c3a3c2d7f50f63c73f86c94b55898fc963242d15542"

RPROVIDES:${PN} += "texlive-uptex-bin"

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
texlive-uptex"

inherit rpm
