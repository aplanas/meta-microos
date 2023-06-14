SUMMARY = "Plugins for libindi"
DESCRIPTION = "This package contains plugins for libindi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "2.0.2"

RPM_NAME = "libindi-plugins-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "9cc5f76e63b173181d444f945e925df99a2aa77dd2144f8fba1af6903439bd2eeeb7af09e281afed9c329ce38839267f496196f15d3ce7fdb76da94b3e1eade2"

RPROVIDES:${PN} += "libindi-Nearest-MathPlugin.so \
libindi-SVD-MathPlugin.so \
libindi-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXISF.so.0 \
libboost-system.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcfitsio.so.10 \
libfftw3.so.3 \
libgcc-s.so.1 \
libindidriver.so.2 \
libjpeg.so.8 \
libm.so.6 \
libnova-0.15.so.0 \
libogg.so.0 \
libstdc++.so.6 \
libtheoradec.so.1 \
libtheoraenc.so.1 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
