SUMMARY = "Binary files of xetex"
DESCRIPTION = "Binary files of xetex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-xetex-bin-2023.20230311.svn66084-93.2.aarch64.rpm"
RPM_HASH = "c8dee963e1f8f9583a08ae30bd2f5bc0fa4429566d0349172455f48d0a44280be5ae8f038c93cdaaa13238ffcb277cfe966a2dd5e2634980a65f861287d81460"

RPROVIDES:${PN} += "texlive-xetex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgraphite2.so.3 \
libharfbuzz.so.0 \
libicuuc.so.73 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
texlive-xetex"

inherit rpm
