SUMMARY = "Virtio-gpu pci device for QEMU"
DESCRIPTION = "This package contains a module providing the virtio gpu pci device for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-display-virtio-gpu-pci-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "05d015d64a600b5c9ca3ce8bc5f75906d78a9ae5997e6f3a2e70c255e42d75779fe97a4237e586795334c5c4cbdc8dcf79c44c6cb4ca6d35dc1c9b30896ccee4"

RPROVIDES:${PN} += "qemu-hw-display-virtio-gpu-pci \
qemu-hw-display-virtio-gpu-pci(aarch-64)"

RDEPENDS:${PN} += "qemu-hw-display-virtio-gpu"

inherit rpm
