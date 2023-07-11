SUMMARY = "Mixed-level, Mixed-signal Circuit Simulator Based on spice3f5"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice."
LICENSE = "BSD-2-Clause"

PV = "40"

RPM_NAME = "ngspice-40-1.2.aarch64.rpm"
RPM_HASH = "53eb08452dc6fcd4e50d1b5c36d17576668d9f9a46978531d76570ff51d3c4a578d241b9c557f309043698cae7d0c42ab9a1eda63cf3a95f2f7cffc9bbbfc7d8"

RPROVIDES:${PN} += "ngspice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXft.so.2 \
libXt.so.6 \
libc.so.6 \
libfftw3.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libtinfo.so.6 \
ngspice-scripts \
ngspice-xspice-cm"

inherit rpm
