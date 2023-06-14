SUMMARY = "Curses based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing curses based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-ui-curses-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "657de5511c55e05030979f380e8d28d8291b6ad9814a0176fa39fb9a4ccc6568e1c1854ac652ed2ee4eda030a19f9ca7607b899b1e0e80410f78ab8ea5a76381"

RPROVIDES:${PN} += "qemu-ui-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
