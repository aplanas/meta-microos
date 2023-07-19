SUMMARY = "Binary files of luajittex"
DESCRIPTION = "Binary files of luajittex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luajittex-bin-2023.20230311.svn66511-93.1.aarch64.rpm"
RPM_HASH = "5a6384c5e5e67029b4aed3a2a14bed14795209ad3c728105e811b43a1197f9480c017004c64081d4435f52e02350a048ecd44dd9b1f0f6db58eaf6b158ab3f8e"

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
