SUMMARY = "USB redirection support for QEMU"
DESCRIPTION = "This package contains a module for USB redirection support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-usb-redirect-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "3fbc2ac1ab4b8bda58ada4623b1e55602023630edefb988969576e11ac7d41425ed4672130dea86a626538caffb7fca4e8da84c644ef984f1e2a8c1bc6929105"

RPROVIDES:${PN} += "qemu-hw-usb-redirect \
qemu-hw-usb-redirect(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libusbredirparser.so.1()(64bit) \
libusbredirparser.so.1(USBREDIRPARSER_0.8.0)(64bit)"

inherit rpm
