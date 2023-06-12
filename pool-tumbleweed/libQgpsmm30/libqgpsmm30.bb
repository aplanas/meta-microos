SUMMARY = "Shared Qt library for GPS applications"
DESCRIPTION = "This package provides the shared Qt library for gpsd and other GPS aware \
applications."
LICENSE = "BSD-3-Clause"

PV = "3.25"

RPM_NAME = "libQgpsmm30-3.25-1.3.aarch64.rpm"
RPM_HASH = "1b6c3bb7ccd6919161529d13df47bbaad26d1a4b101f01ceba0371b5bdd93344fea09424b6dc1dc9c110f768bd701f0823021c3ffc5ee3607b3efde80c29e495"

RPROVIDES:${PN} += "libQgpsmm.so.30()(64bit) \
libQgpsmm30 \
libQgpsmm30(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libbluetooth.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
