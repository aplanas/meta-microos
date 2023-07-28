SUMMARY = "JACK based audio support for QEMU"
DESCRIPTION = "This package contains a module for JACK based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-audio-jack-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "5b0ef8c0dca6a8a697e58eb8cbea8b4ad912e51b723d7ab9c143771b971cd413ca068b69d6c60c15115af7012555597648fa63f78693c04ac8833d9ae07fdea0"

RPROVIDES:${PN} += "qemu-audio-jack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0"

inherit rpm
