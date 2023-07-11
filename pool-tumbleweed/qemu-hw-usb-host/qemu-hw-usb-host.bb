SUMMARY = "USB passthrough driver support for QEMU"
DESCRIPTION = "This package contains a modules for USB passthrough driver for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-usb-host-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "ee8e3c816016e0f0ed9d895e2b86ddfe4a2bfa47e64cc157ca9288dfe2488848510c537cc355841ed6f9c6600c5aecc7e4c280332739fa8eff2a383ecbc04c85"

RPROVIDES:${PN} += "qemu-hw-usb-host"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
