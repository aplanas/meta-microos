SUMMARY = "Spice based audio support for QEMU"
DESCRIPTION = "This package contains a module for Spice based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-audio-spice-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "8eb725e75f30d8d95bd9d7d29df9daaa77491727f193cfe642bf2bd534b7a232659b8e42e682f1ff9b55d0bbfa0bb610cd874f30360962534695c4547f77a80d"

RPROVIDES:${PN} += "qemu-audio-spice \
qemu-audio-spice(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libspice-server.so.1()(64bit) \
qemu-ui-spice-core"

inherit rpm
