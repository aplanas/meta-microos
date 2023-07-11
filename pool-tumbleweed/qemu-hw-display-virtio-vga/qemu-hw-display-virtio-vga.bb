SUMMARY = "Virtio vga device for QEMU"
DESCRIPTION = "This package contains a module providing the virtio vga device for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-display-virtio-vga-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "1d6663d4bb93be3f81f4dd150fa99acea9678901d00f0ee66a23c4509428431f7919902b5d5adf65b3107c6a1cbe62b3a7a7f9dde33862fdf469146a937e00c8"

RPROVIDES:${PN} += "qemu-hw-display-virtio-vga"

RDEPENDS:${PN} += ""

inherit rpm
