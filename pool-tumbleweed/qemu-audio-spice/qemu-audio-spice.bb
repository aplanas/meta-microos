SUMMARY = "Spice based audio support for QEMU"
DESCRIPTION = "This package contains a module for Spice based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-audio-spice-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "3b33d22bca0728ecfa49e0ef8948a6ba05d70e1d6d6e834f5e5159fbf5f25d4d2a6945ffa7f228cd440feead8968c91402e321f5c6919f7dd67ccdc76019a57f"

RPROVIDES:${PN} += "qemu-audio-spice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
