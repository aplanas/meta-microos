SUMMARY = "DMG block support for QEMU"
DESCRIPTION = "This package contains a module for accessing Mac OS X image files from \
qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-block-dmg-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "f4e0ff5220fb8ca1d431924862a76efb020008df3d656c93a817832e7740796c36ca5911c45195372c19787d10c928fa56ce02b4d93c71b03e12d55114f06077"

RPROVIDES:${PN} += "qemu-block-dmg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzfse.so"

inherit rpm
