SUMMARY = "D-Bus based audio support for QEMU"
DESCRIPTION = "This package provides a module for D-Bus based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-audio-dbus-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "bbdecf48a1be1504c01b13dc621ad2cf1c7ebdbe718f9fbbec56a6c0446776996dca936ebb79f3a1b24dcf7e1590de196b4917d07db63efacdbec81d6a0a53c9"

RPROVIDES:${PN} += "qemu-audio-dbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
