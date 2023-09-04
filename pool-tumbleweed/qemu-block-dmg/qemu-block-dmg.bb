SUMMARY = "DMG block support for QEMU"
DESCRIPTION = "This package contains a module for accessing Mac OS X image files from \
qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-block-dmg-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "8c7589d39e629d083b5c38aae3eb19cbc07758558c56a21ddfbc22dc9c0e9105e547ebb13a3e9e99b9c1f5bab38cfbafffc740a5e4d237ed0c8c050fe2996fa9"

RPROVIDES:${PN} += "qemu-block-dmg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzfse.so"

inherit rpm
