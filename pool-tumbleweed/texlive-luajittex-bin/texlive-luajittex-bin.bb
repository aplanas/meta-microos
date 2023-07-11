SUMMARY = "Binary files of luajittex"
DESCRIPTION = "Binary files of luajittex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luajittex-bin-2023.20230311.svn66511-92.1.aarch64.rpm"
RPM_HASH = "892fee7dbf1b13e562ac2da6e8912bbdf7fcbce1971f9818ff764c9998acb278128c98db972c00eba1e877b1ff90b6f775d0dda66ea66f0dfc887a467f478beb"

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
