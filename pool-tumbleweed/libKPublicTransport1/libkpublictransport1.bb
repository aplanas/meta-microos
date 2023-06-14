SUMMARY = "Library for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libKPublicTransport1-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "9b4805d2b0d59c280f70cd86a67f98debf3cf8ba824ccea9ccd58710770571b8eb063ed141475167ae4e35b216157298f8a74e5b2caa0a02ac287ea70b7eab96"

RPROVIDES:${PN} += "libKPublicTransport.so.1 \
libKPublicTransport1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
