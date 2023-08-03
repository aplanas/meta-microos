SUMMARY = "Virtio-gpu pci device for QEMU"
DESCRIPTION = "This package contains a module providing the virtio gpu pci device for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-display-virtio-gpu-pci-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "f6670d644ddbc0092bbc84e3f82f79983d6b133dcabb1397d7232614482d270cf1277ceb16376a10c16f0bbb52402d9267e52f8993cc5d311b4116408c41ec66"

RPROVIDES:${PN} += "qemu-hw-display-virtio-gpu-pci"

RDEPENDS:${PN} += "qemu-hw-display-virtio-gpu"

inherit rpm
