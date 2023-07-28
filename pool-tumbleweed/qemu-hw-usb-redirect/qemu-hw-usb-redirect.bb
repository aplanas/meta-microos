SUMMARY = "USB redirection support for QEMU"
DESCRIPTION = "This package contains a module for USB redirection support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-usb-redirect-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "6c6dd14e1c1cd9944878f57c5d2aae3bc782c623455ad8f93791ffeb64ce91635cb2905d2096e3ea32b99d8fd8c15e8827a700003c5ed8186f2aa447c8c3ac04"

RPROVIDES:${PN} += "qemu-hw-usb-redirect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusbredirparser.so.1"

inherit rpm
