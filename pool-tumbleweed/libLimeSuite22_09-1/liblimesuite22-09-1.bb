SUMMARY = "Library for Lime Suite"
DESCRIPTION = "Lime Suite is a collection of software supporting several hardware \
platforms and other tools for developing with LMS7-based hardware."
LICENSE = "Apache-2.0"

PV = "22.09.1"

RPM_NAME = "libLimeSuite22_09-1-22.09.1-2.2.aarch64.rpm"
RPM_HASH = "b55de91e33a2417212c82efb1973226fc2d62cf95d367c172ac26f8db856fcc83fd9d743fc02afad10d3badc6fe059527f46c663c276add6b5056ad096027835"

RPROVIDES:${PN} += "libLimeSuite.so.22.09-1 \
libLimeSuite22-09-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libusb-1.0.so.0 \
limesuite-udev"

inherit rpm
