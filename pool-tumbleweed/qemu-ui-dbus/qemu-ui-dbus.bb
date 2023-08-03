SUMMARY = "D-Bus based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing D-Bus based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ui-dbus-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "0d8626d5b16442d911e7c1a651f7d5fe5e9ff54ce07a391f9ecb0c7a71c96aa5e036bec83b8e335e6502bea301cf5876ecf0ff2147ba81552159fe28d389a750"

RPROVIDES:${PN} += "qemu-ui-dbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpixman-1.so.0"

inherit rpm
