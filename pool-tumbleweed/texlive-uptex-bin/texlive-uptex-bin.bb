SUMMARY = "Binary files of uptex"
DESCRIPTION = "Binary files of uptex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66382"

RPM_NAME = "texlive-uptex-bin-2023.20230311.svn66382-93.2.aarch64.rpm"
RPM_HASH = "d6f756dd202be8f262c3f5d68860114c06fac8e7502ab943d66a3ba9ccd8cc8e9738e7b87d22784e4e4ea4757b8dfb5d02a5950e7583bf186088e2bcf60ba4e6"

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
