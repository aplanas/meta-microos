SUMMARY = "Virtio-gpu pci device for QEMU"
DESCRIPTION = "This package contains a module providing the virtio gpu pci device for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-hw-display-virtio-gpu-pci-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "a3244bfa6712c7f9e1f0dde5e08690c0f8f4626dd9d40f48844560e29f57a1fb5912200054a0748683f18a5759a4249f29f9e8e9cbf40f651f87a0435c09f359"

RPROVIDES:${PN} += "qemu-hw-display-virtio-gpu-pci"

RDEPENDS:${PN} += "qemu-hw-display-virtio-gpu"

inherit rpm
