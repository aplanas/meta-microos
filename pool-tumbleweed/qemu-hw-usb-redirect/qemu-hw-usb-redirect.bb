SUMMARY = "USB redirection support for QEMU"
DESCRIPTION = "This package contains a module for USB redirection support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-usb-redirect-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "4fa94f3c4b0cbd0d15dfa63f0e531b49b98390f3bdd5617b112833f8880dcf14d99c0ac50d0fb402ff08855fadd937573f0675988c770dcd0e56aa2da1f4d07c"

RPROVIDES:${PN} += "qemu-hw-usb-redirect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusbredirparser.so.1"

inherit rpm
