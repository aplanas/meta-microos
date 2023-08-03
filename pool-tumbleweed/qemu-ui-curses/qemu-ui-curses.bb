SUMMARY = "Curses based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing curses based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ui-curses-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "3f1d990b556f1e93c1b6b160c9fa27b1448ae9b2c6dded9254663e7e568a9e8bb926940ccd93dc0cdbf6af95c87fe4f04f0407eca710165b7277a03fbc29bd93"

RPROVIDES:${PN} += "qemu-ui-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
