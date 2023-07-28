SUMMARY = "Spice vmc and port chardev support for QEMU"
DESCRIPTION = "This package contains a module for Spice chardev support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-chardev-spice-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "aef9e45f15fe9200f2ace46003b7116b2de2fe4347863489d8356b3b1c5724febae7bf0d6ec43b13fea2b553cbbbba2d43c23ff353c18cc48ec367edb2d9ced4"

RPROVIDES:${PN} += "qemu-chardev-spice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
