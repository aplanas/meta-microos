SUMMARY = "Virtio-gpu pci device for QEMU"
DESCRIPTION = "This package contains a module providing the virtio gpu pci device for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-display-virtio-gpu-pci-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "d3c2de3c272eea6ade6665478924750bb430ebd0cc36019c2a775a419abfcb67f55b5842a9d45f2dd239c11f28569e03660bbd32815b8b758179c6038a327eac"

RPROVIDES:${PN} += "qemu-hw-display-virtio-gpu-pci"

RDEPENDS:${PN} += "qemu-hw-display-virtio-gpu"

inherit rpm
