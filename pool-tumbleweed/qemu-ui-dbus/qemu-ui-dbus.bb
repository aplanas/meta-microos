SUMMARY = "D-Bus based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing D-Bus based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-ui-dbus-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "031296526e6342cab61c9f56570323012bb04d305481413460858254e9378fe24cc3b752efab5ff8f7edebd76c777401e6df691cf85e72502bb034afd1fcfc1e"

RPROVIDES:${PN} += "qemu-ui-dbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpixman-1.so.0"

inherit rpm
