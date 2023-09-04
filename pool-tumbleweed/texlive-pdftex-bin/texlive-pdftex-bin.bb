SUMMARY = "Binary files of pdftex"
DESCRIPTION = "Binary files of pdftex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-pdftex-bin-2023.20230311.svn66084-93.2.aarch64.rpm"
RPM_HASH = "3f0d9eed03fe9c34065eed2469bf063a868a86c15888daab3470267f58d3f95659a9fed4004cedfc4ea881566de7945b6baa61d7bfe1f91810c35d7b7079cfb8"

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
