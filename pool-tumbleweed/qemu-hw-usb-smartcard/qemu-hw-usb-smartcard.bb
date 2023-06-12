SUMMARY = "USB smartcard support for QEMU"
DESCRIPTION = "This package contains a modules for USB smartcard support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-usb-smartcard-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "4653e60472996b2339a631dc1fc9faddea281141ec097157c156a7569a386842a5f94190c2369b1c72c6927ed633bf994f963dcfff0bf4ad7229caf345a98a86"

RPROVIDES:${PN} += "qemu-hw-usb-smartcard \
qemu-hw-usb-smartcard(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcacard.so.0()(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
