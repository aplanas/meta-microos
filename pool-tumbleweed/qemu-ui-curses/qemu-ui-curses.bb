SUMMARY = "Curses based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing curses based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ui-curses-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "70bbcd7c9d2d1f26a1265c70acb596747ba112c7483e36f9a24c98bb6467655d3ad734c2a1b656129803307c4ea211ff84249c44c11ee8784e73e3d455baf235"

RPROVIDES:${PN} += "qemu-ui-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
