SUMMARY = "Virtio vga device for QEMU"
DESCRIPTION = "This package contains a module providing the virtio vga device for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-display-virtio-vga-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "56a461ac1b1c5a5265eb9d3c026e6b381ad4756a1cd73c4fa398114bf68c1d659d86093ce9235d0d6cf4721de8e4971b97bfedc1dce4a42678591804a5382088"

RPROVIDES:${PN} += "qemu-hw-display-virtio-vga"

RDEPENDS:${PN} += ""

inherit rpm
