SUMMARY = "Binary files of luajittex"
DESCRIPTION = "Binary files of luajittex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luajittex-bin-2023.20230311.svn66511-91.1.aarch64.rpm"
RPM_HASH = "9b34196ee52847f5c618bed758f9073eec7d0049c00816ccfa8c68fa30f9ace5969aca15eb30ed9a5da0c7b1f99d109f5e001c62ef1c1333ac6a33984a90d438"

RPROVIDES:${PN} += "texlive-luajittex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libharfbuzz.so.0 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libtexluajit.so.2 \
libz.so.1 \
libzzip.so.13 \
texlive-luajittex"

inherit rpm
