SUMMARY = "Virtio vga device for QEMU"
DESCRIPTION = "This package contains a module providing the virtio vga device for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-hw-display-virtio-vga-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "70b678f47a62c8f55926882972e9a8b55d2ed173a679f988c6e9a12e0e5f011d054a3fb34675fc94b1e1553216467da8e1a3d5f6bbd5aa2a91220af3edef92ee"

RPROVIDES:${PN} += "qemu-hw-display-virtio-vga"

RDEPENDS:${PN} += ""

inherit rpm
