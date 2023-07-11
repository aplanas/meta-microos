SUMMARY = "Spice based audio support for QEMU"
DESCRIPTION = "This package contains a module for Spice based audio support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-audio-spice-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "c0080bbdfc1dd820f403e6075bcb5e8d64c7f86c7b1efe81cb98ba242d9705292d0e6194bd38a2a3f715d9a544034a3e80d53c86731dac411430aba13c62c0b5"

RPROVIDES:${PN} += "qemu-audio-spice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
