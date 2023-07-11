SUMMARY = "Binary files of luatex"
DESCRIPTION = "Binary files of luatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luatex-bin-2023.20230311.svn66511-92.1.aarch64.rpm"
RPM_HASH = "8664067d154a603cfbeeef8b32efb8f07d482f91fcb3cb1b8f24cd4b5dc7486f849a7b0bf6ceaa1e166a97c9e1b2553f98cdb5ed3af48c2f8e18d5d208e64db7"

RPROVIDES:${PN} += "texlive-luatex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libtexlua53.so.5 \
libz.so.1 \
libzzip.so.13 \
texlive-luatex"

inherit rpm
