SUMMARY = "USB passthrough driver support for QEMU"
DESCRIPTION = "This package contains a modules for USB passthrough driver for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-usb-host-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "f237358596da5f804ce808845b8bd28637f8f01c52f6147a85f969c250ab62d87c8c9e95967d64447d17dc46d5ef491cf938d45f7da258f4944e84f92e3fe7f4"

RPROVIDES:${PN} += "qemu-hw-usb-host"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
