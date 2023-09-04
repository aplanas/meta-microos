SUMMARY = "Binary files of luajittex"
DESCRIPTION = "Binary files of luajittex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66511"

RPM_NAME = "texlive-luajittex-bin-2023.20230311.svn66511-93.2.aarch64.rpm"
RPM_HASH = "6beac5553b2da9b973bc195ab06759019dc93c07f197ac41fd7c8af17da65a6d03af7085ad276cfecca64134a86ef9bb506ed2f957573409fed6d77af8668258"

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
