SUMMARY = "JACK based audio support for QEMU"
DESCRIPTION = "This package contains a module for JACK based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-audio-jack-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "e722370420107277119bf26372afe41f1014ca7971167ab34eb26351fcb1662f377bfa16ddbef5744b5612928f57cdf105c483ead7d5b69988b8f8326a537fa9"

RPROVIDES:${PN} += "qemu-audio-jack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjack.so.0"

inherit rpm
