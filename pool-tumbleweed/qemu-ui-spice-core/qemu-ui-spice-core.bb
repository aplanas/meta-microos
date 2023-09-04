SUMMARY = "Core Spice support for QEMU"
DESCRIPTION = "This package contains a module with core Spice support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-ui-spice-core-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "b50ee9e7887a56ea5c17682819a79f118a4432925acf6c8cec417a01843850a050c0198b4bd8bc464f0fcfa39aeae1e0af29e0f8345e6eda26e74221fa3aff6d"

RPROVIDES:${PN} += "qemu-ui-spice-core"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libspice-server.so.1 \
qemu-audio-spice \
qemu-ui-opengl"

inherit rpm
