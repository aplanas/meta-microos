SUMMARY = "Disomaster Libraries"
DESCRIPTION = "A libisoburn wrapper class for Qt. \
 \
The libdisomaster1 package contains the Libraries for \
disomaster movie."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.8"

RPM_NAME = "libdisomaster1-5.0.8-1.4.aarch64.rpm"
RPM_HASH = "069e60e806556945de68f9ece579561aa8501ffe345f1f97f2c9ee9ce7727c038d58f4be9665cf49743b7694cf33271b9f949bce16cb29f2543f53f9932efa2d"

RPROVIDES:${PN} += "libdisomaster.so.1 \
libdisomaster1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libisoburn.so.1 \
libstdc++.so.6"

inherit rpm
