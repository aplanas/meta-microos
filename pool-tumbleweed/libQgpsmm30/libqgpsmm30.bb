SUMMARY = "Shared Qt library for GPS applications"
DESCRIPTION = "This package provides the shared Qt library for gpsd and other GPS aware \
applications."
LICENSE = "BSD-3-Clause"

PV = "3.25"

RPM_NAME = "libQgpsmm30-3.25-1.3.aarch64.rpm"
RPM_HASH = "1b6c3bb7ccd6919161529d13df47bbaad26d1a4b101f01ceba0371b5bdd93344fea09424b6dc1dc9c110f768bd701f0823021c3ffc5ee3607b3efde80c29e495"

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
