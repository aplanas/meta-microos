SUMMARY = "Virtio vga device for QEMU"
DESCRIPTION = "This package contains a module providing the virtio vga device for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-display-virtio-vga-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "6a5f49dfbbee7a5a76d06ed3beaec891d46372a9b1191adc2f02b8d21008dc97144377190ff00f396d880a463a89965ff16d163968c4764b9d036dd80e7c4446"

RPROVIDES:${PN} += "qemu-hw-display-virtio-vga \
qemu-hw-display-virtio-vga(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
