SUMMARY = "DMG block support for QEMU"
DESCRIPTION = "This package contains a module for accessing Mac OS X image files from \
qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-block-dmg-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "a2b52f9283ddc7da5a7146654cd6111ef34a76b15b17f218a477bcb93fea6e058a706e51f1226130d36eb0b789e8516d4052a7025272b81a65b234580c288c22"

RPROVIDES:${PN} += "qemu-block-dmg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzfse.so"

inherit rpm
