SUMMARY = "QXL display support for QEMU"
DESCRIPTION = "This package contains a module for QXL display support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-hw-display-qxl-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "ac0e754ce17b74c0e7c894c89dd756e3469222d52cb0cb51aaa04dc28c8483376194fa54ed2ca631272586253979da43fa26800ca81ad5c48e60f41ab11ed61e"

RPROVIDES:${PN} += "qemu-hw-display-qxl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
