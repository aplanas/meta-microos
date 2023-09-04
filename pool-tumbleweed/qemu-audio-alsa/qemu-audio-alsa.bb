SUMMARY = "ALSA based audio support for QEMU"
DESCRIPTION = "This package contains a module for ALSA based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-audio-alsa-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "7ce754f884a0f3b8deabc3ea7759c2101bfb1c5ecd74fe3983ad2a06d253db31a8da28077657e631148e09b8025f4c5227dc507ea58dc9c56ece0b9c2d7fa921"

RPROVIDES:${PN} += "qemu-audio-alsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
