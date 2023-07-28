SUMMARY = "Pulse Audio based audio support for QEMU"
DESCRIPTION = "This package contains a module for Pulse Audio based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-audio-pa-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "d099f2cd9e874fc678f31568dd17b8f2b4679357f8823b5e321e9a8f0afd7bab3c6f1e6093ed0216ef542a9026e3b875f19dea407fee637374704a9ad58814a1"

RPROVIDES:${PN} += "qemu-audio-pa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpulse.so.0"

inherit rpm
