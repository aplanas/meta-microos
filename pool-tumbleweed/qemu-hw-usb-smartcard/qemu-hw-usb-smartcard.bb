SUMMARY = "USB smartcard support for QEMU"
DESCRIPTION = "This package contains a modules for USB smartcard support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-usb-smartcard-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "0c384c9afacc7c56af31f83979d78a37e494ae569cdacc8d51d60f4bd2b04da77885fefc96fa6f42d33576590402198ed3611cbc9e446270c952c7c5cfb01107"

RPROVIDES:${PN} += "qemu-hw-usb-smartcard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcacard.so.0 \
libglib-2.0.so.0"

inherit rpm
