SUMMARY = "Binary files of luatex"
DESCRIPTION = "Binary files of luatex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luatex-bin-2023.20230311.svn66511-93.1.aarch64.rpm"
RPM_HASH = "e5e50df4bc36cb78c195f1ee18d0dbf975e7b482df7f02c81f90c889b0416e78a2f61aaa965960808631bb23f813168dc46f20874bf3e39664ee3166d811696f"

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
