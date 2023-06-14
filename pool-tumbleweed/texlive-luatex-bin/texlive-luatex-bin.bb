SUMMARY = "Binary files of luatex"
DESCRIPTION = "Binary files of luatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luatex-bin-2023.20230311.svn66511-91.1.aarch64.rpm"
RPM_HASH = "22c2571a8d6fd34db927cadb732b984f7c629725ccf72cfafd40304c7a09c66be916cb5821aad1c89451c4d80a955e305297c1becfb72f4471be250d57fe1d10"

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
