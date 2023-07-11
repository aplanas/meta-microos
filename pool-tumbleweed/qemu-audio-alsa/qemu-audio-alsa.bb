SUMMARY = "ALSA based audio support for QEMU"
DESCRIPTION = "This package contains a module for ALSA based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-audio-alsa-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "123ab4b3e8487cf57ba5b85c2d765d34b081f18c7983309e02c586c83c6ca9a9d830559748d23d1d177f3476166d54067973baf90838ba3e18e428a1b51dfba2"

RPROVIDES:${PN} += "qemu-audio-alsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
