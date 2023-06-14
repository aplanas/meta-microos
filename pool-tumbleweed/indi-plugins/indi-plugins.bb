SUMMARY = "Plugins for libindi"
DESCRIPTION = "This package contains plugins for libindi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "1.9.9"

RPM_NAME = "indi-plugins-1.9.9-2.2.aarch64.rpm"
RPM_HASH = "1855cfae4515bec77a41a7f5efc5eb300339e8b673ddf4229b5b8fba400bc139ac3f883b3e1e574e89acaaaeaa647e84fe8dd0ddb8094c952469aa7c92cd0610"

RPROVIDES:${PN} += "indi-plugins \
libindi-Nearest-MathPlugin.so \
libindi-SVD-MathPlugin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-system.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcfitsio.so.10 \
libfftw3.so.3 \
libgcc-s.so.1 \
libindidriver.so.1 \
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
