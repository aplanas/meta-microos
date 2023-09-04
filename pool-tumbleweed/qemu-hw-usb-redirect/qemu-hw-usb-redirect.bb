SUMMARY = "USB redirection support for QEMU"
DESCRIPTION = "This package contains a module for USB redirection support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-hw-usb-redirect-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "c4bcaed48dd9dccf79ad0e156f52d85459e1afd8979b26f89c389f6ef71f4d4b18868b3d41b4f3524dbf96fadefd0cb6223a4db8067b5c8d2b74f83288f504cc"

RPROVIDES:${PN} += "qemu-hw-usb-redirect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusbredirparser.so.1"

inherit rpm
