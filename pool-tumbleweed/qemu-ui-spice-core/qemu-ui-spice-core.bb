SUMMARY = "Core Spice support for QEMU"
DESCRIPTION = "This package contains a module with core Spice support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ui-spice-core-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "9270a91ec97c9471a1897e6c3e9e3365b2d7ee40f0836de17a02e6f3af41a46c17d9e6886adf8fc704a34fdb0b2e00683bbda2b87eed887dd5609c334b5668ba"

RPROVIDES:${PN} += "qemu-ui-spice-core"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libspice-server.so.1 \
qemu-audio-spice \
qemu-ui-opengl"

inherit rpm
