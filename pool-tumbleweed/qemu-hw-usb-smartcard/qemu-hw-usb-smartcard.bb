SUMMARY = "USB smartcard support for QEMU"
DESCRIPTION = "This package contains a modules for USB smartcard support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-hw-usb-smartcard-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "ea6019bdea51035e3d8a3c0694419ff9c6954888380d8248fa24060f2a26f27332ad909daf3d464daf2fcac945f408d886d77d0da7ad34489d72a71e4b427cf2"

RPROVIDES:${PN} += "qemu-hw-usb-smartcard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcacard.so.0 \
libglib-2.0.so.0"

inherit rpm
