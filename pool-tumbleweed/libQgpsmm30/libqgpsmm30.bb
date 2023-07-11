SUMMARY = "Shared Qt library for GPS applications"
DESCRIPTION = "This package provides the shared Qt library for gpsd and other GPS aware \
applications."
LICENSE = "BSD-3-Clause"

PV = "3.25"

RPM_NAME = "libQgpsmm30-3.25-1.4.aarch64.rpm"
RPM_HASH = "bbf8d801867fc8f18a0005faafeeb219963aa43b5744a28883f639b2c6b6b0bb9e4e9c5b617dc34c1a22edab37045adb3407a5dc3aa79af9d466701e055f8f98"

RPROVIDES:${PN} += "libQgpsmm.so.30 \
libQgpsmm30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libbluetooth.so.3 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
