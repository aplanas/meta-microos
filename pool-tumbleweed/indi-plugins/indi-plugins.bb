SUMMARY = "Plugins for libindi"
DESCRIPTION = "This package contains plugins for libindi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "1.9.9"

RPM_NAME = "indi-plugins-1.9.9-2.3.aarch64.rpm"
RPM_HASH = "ea4a263a1ca7b599a36ed6e224b1a1b2993bcfeee65d5c119118ccbd77480816097b52b2ff09c5a84d182e1e3416ac2237b7911fddc32941e52578bf8c816624"

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
