SUMMARY = "D-Bus based audio support for QEMU"
DESCRIPTION = "This package provides a module for D-Bus based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-audio-dbus-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "00a5c761498275e321dacde3ad574c0e0f67de3eb7315658161c888945fa358fb30b0907b9b25b3752d9160460ec13e19a9fc86be71cc8daa3c17102ce2b4bb4"

RPROVIDES:${PN} += "qemu-audio-dbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
