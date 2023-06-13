SUMMARY = "QXL display support for QEMU"
DESCRIPTION = "This package contains a module for QXL display support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-display-qxl-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "3efc18ffe7b8ce860291e9d57a1c036ca7a903294547bf5a8e4600cc27f5f10b2cccb951bc3d9364657a7ff651dd0d70b97a4b1f0d40ff290c72f40f255cee77"

RPROVIDES:${PN} += "qemu-hw-display-qxl \
qemu-hw-display-qxl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpixman-1.so.0()(64bit) \
libspice-server.so.1()(64bit) \
libspice-server.so.1(SPICE_SERVER_0.10.4)(64bit) \
libspice-server.so.1(SPICE_SERVER_0.12.3)(64bit) \
libspice-server.so.1(SPICE_SERVER_0.14.2)(64bit) \
libspice-server.so.1(SPICE_SERVER_0.8.2)(64bit) \
qemu-ui-spice-core"

inherit rpm
