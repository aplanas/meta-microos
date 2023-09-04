SUMMARY = "JACK based audio support for QEMU"
DESCRIPTION = "This package contains a module for JACK based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-audio-jack-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "89e861d01779e47a7eee2519da701b2179f5596a59ad62b6c45aef4d22567cf75363cffce22c3a755296d6974142b467e4de79c2c3b05b906d83f15b26c9e3c4"

RPROVIDES:${PN} += "qemu-audio-jack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0"

inherit rpm
