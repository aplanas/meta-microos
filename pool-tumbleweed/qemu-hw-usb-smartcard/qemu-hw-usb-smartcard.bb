SUMMARY = "USB smartcard support for QEMU"
DESCRIPTION = "This package contains a modules for USB smartcard support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-usb-smartcard-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "57cb027e55f8e184829349bb2e8c03eac50c14e382c4dc1e469d142487d3d05a8da87fd16e0fceebb4a786b02fc201e21309f9b6032b6d5529b595ce30f8b34d"

RPROVIDES:${PN} += "qemu-hw-usb-smartcard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcacard.so.0 \
libglib-2.0.so.0"

inherit rpm
