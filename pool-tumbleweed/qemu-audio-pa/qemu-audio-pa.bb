SUMMARY = "Pulse Audio based audio support for QEMU"
DESCRIPTION = "This package contains a module for Pulse Audio based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-audio-pa-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "4db6504ccc54f906469525a3d8b0a04e357c76571abb7be344c5b7d745dfcd24b9732a5a52608592ac14a91c64177d2d9a295098b37024241852afbf96a0d657"

RPROVIDES:${PN} += "qemu-audio-pa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpulse.so.0"

inherit rpm
