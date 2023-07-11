SUMMARY = "JACK based audio support for QEMU"
DESCRIPTION = "This package contains a module for JACK based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-audio-jack-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "c275f1f6f174e726fea68001cb387a97f996c7a60783bf625d2c936d2ee47bfd4d1b85579ff32cd99673b06471809908333d50af2c4548ba261de7c5f26be426"

RPROVIDES:${PN} += "qemu-audio-jack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0"

inherit rpm
