SUMMARY = "Virtio-gpu pci device for QEMU"
DESCRIPTION = "This package contains a module providing the virtio gpu pci device for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-display-virtio-gpu-pci-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "dc304b583c9f0595bbd59e9c3382b9dd9c6bdae68c7d18026e714eabf6eda279292b0b4d5e0a7e91ce91397e8429bf1d6599967c52feffc9838437b82b32896b"

RPROVIDES:${PN} += "qemu-hw-display-virtio-gpu-pci"

RDEPENDS:${PN} += "qemu-hw-display-virtio-gpu"

inherit rpm
