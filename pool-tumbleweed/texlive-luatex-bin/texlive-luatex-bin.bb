SUMMARY = "Binary files of luatex"
DESCRIPTION = "Binary files of luatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luatex-bin-2023.20230311.svn66511-93.2.aarch64.rpm"
RPM_HASH = "319925f97ac021a116e5a6e4820df11ae352a940913e1419fa368fc0580c0f77ab4fa3f727e0fbd6d9e856f49afba4b555479d65b001355b54cce948391e7aaf"

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
