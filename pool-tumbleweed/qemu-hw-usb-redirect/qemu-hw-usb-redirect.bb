SUMMARY = "USB redirection support for QEMU"
DESCRIPTION = "This package contains a module for USB redirection support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-usb-redirect-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "a84e0a75f77ab54447cab4382a1ea6bd2d4c4f0b2509ae1f8f0f2fae08097f29022c68eb365c42e65f470ff96895612a621119f424eb1c59bb06805690f6dcb5"

RPROVIDES:${PN} += "qemu-hw-usb-redirect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusbredirparser.so.1"

inherit rpm
