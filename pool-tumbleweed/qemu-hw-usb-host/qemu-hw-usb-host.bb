SUMMARY = "USB passthrough driver support for QEMU"
DESCRIPTION = "This package contains a modules for USB passthrough driver for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-hw-usb-host-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "4961ecc6443207f6b73d13aeee59a716ae9f27f914c79f602fb8546112fc791fa70689943c0b1fe724739fa4cf8624aa459c06cbe08fb0b3f468234b003bd826"

RPROVIDES:${PN} += "qemu-hw-usb-host"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
