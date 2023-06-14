SUMMARY = "Binary files of pdftex"
DESCRIPTION = "Binary files of pdftex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66084"

RPM_NAME = "texlive-pdftex-bin-2023.20230311.svn66084-91.1.aarch64.rpm"
RPM_HASH = "851efc337f23bd14095c4fd2dadefbea9d836e5b2b1b0911ec44265856554372dba36dc7a589d9b3ba30c9600adc75801d5d88270daaf9716d1d1c33fd2a0502"

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
