SUMMARY = "D-Bus based audio support for QEMU"
DESCRIPTION = "This package provides a module for D-Bus based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-audio-dbus-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "2be86732b0ad6af947f0cd8dbee409af103a2f8b88f7e72e6d19e8b827c12b0b3ae5b501be59807d76000311aa35ca050f041ff0ae90683e7e0f691bd2c06999"

RPROVIDES:${PN} += "qemu-audio-dbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
