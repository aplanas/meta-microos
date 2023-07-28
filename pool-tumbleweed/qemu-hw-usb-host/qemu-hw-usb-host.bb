SUMMARY = "USB passthrough driver support for QEMU"
DESCRIPTION = "This package contains a modules for USB passthrough driver for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-usb-host-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "d05c7efd271fadbfec76e21e9572e8713ad1fb18818527d2d9a7e3cb9ae758309b3eee80e8a7d204340f525e17a5d6e19e9d5081279cad611b2044e8a7ab8abb"

RPROVIDES:${PN} += "qemu-hw-usb-host"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
