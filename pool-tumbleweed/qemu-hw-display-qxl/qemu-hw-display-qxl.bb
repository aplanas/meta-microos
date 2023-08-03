SUMMARY = "QXL display support for QEMU"
DESCRIPTION = "This package contains a module for QXL display support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-display-qxl-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "f0c32768b0606f506ada000917faad09040fd94cdf9acd2253cf4b5538bc0f61d3fc65c735af841a3413cd613378094bf4c4484d12f4e563365d10898ad571ca"

RPROVIDES:${PN} += "qemu-hw-display-qxl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
