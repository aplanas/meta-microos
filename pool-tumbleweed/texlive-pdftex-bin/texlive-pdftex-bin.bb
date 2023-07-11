SUMMARY = "Binary files of pdftex"
DESCRIPTION = "Binary files of pdftex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-pdftex-bin-2023.20230311.svn66084-92.1.aarch64.rpm"
RPM_HASH = "0ac4d33ff5e0f8d7021310f417b09a31712f57aba397ff1ef18253727f213f0784d0742fb7ed260874c46133852d8b5068108802e2a82f69fe754c857c65b9ba"

RPROVIDES:${PN} += "texlive-pdftex-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkpathsea.so.6 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libz.so.1 \
texlive-pdftex"

inherit rpm
