SUMMARY = "Pulse Audio based audio support for QEMU"
DESCRIPTION = "This package contains a module for Pulse Audio based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-audio-pa-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "eba4c1575d5ce0fc75c549b45869d5bb3eef21d1d7fb69fc6995f942a0ac4ad22624aaea672aa493e3e37f04cd5faca5f0ca860e27e6d8fe7dabdcb5f47a5b64"

RPROVIDES:${PN} += "qemu-audio-pa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpulse.so.0"

inherit rpm
