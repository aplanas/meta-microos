SUMMARY = "D-Bus based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing D-Bus based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ui-dbus-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "f8d1b218f782cde0960145f6db3d6948287caa2b034000389ceff71fbb212ffd6cc488afe257c1443d31a61848fc8d2c7cf4a91035d39dd025046a0ef1906efa"

RPROVIDES:${PN} += "qemu-ui-dbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpixman-1.so.0"

inherit rpm
