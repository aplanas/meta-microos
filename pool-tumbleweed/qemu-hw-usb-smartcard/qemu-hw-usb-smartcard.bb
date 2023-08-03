SUMMARY = "USB smartcard support for QEMU"
DESCRIPTION = "This package contains a modules for USB smartcard support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-usb-smartcard-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "bcec5999e4ca2c778ff9f8a13a3f66fb5b36bdf057cc200f003d6c6e561f61f9fe25454e9a5fe9bd0c62c211eafeb13b7cc03de4e75a261e9e9982e47cc8f755"

RPROVIDES:${PN} += "qemu-hw-usb-smartcard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcacard.so.0 \
libglib-2.0.so.0"

inherit rpm
