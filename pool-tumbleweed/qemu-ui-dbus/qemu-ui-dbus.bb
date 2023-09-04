SUMMARY = "D-Bus based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing D-Bus based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-ui-dbus-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "b52440f94429bee419ab2dc5a37727b618824f63f1fdc853deefc40a85f6ce0bdac260e802608c657399b3a9de2e155880ac4e9ab36be31b253ba2b47123ef80"

RPROVIDES:${PN} += "qemu-ui-dbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpixman-1.so.0"

inherit rpm
