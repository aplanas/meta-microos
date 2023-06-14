SUMMARY = "DMG block support for QEMU"
DESCRIPTION = "This package contains a module for accessing Mac OS X image files from \
qemu-img tool and QEMU system emulation."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-block-dmg-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "feb43fde66e94e2063ff9720511ed00a26dbd6df7cff0dd0083695a9e51c1a64dca26be5a134b017c3d8c8e4dac02029a0a459e8afdbcacbb38543fd9ee233dc"

RPROVIDES:${PN} += "qemu-block-dmg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzfse.so"

inherit rpm
