SUMMARY = "JACK based audio support for QEMU"
DESCRIPTION = "This package contains a module for JACK based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-audio-jack-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "28760129ac3eee635f12ce6a89bb930e2c1391f4f98a01f296a73c0d5ce05d4a6132d590ae7b95ad8c5316944a06bc5c147fbe475268b1855e2c16b91d9c202b"

RPROVIDES:${PN} += "qemu-audio-jack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0"

inherit rpm
