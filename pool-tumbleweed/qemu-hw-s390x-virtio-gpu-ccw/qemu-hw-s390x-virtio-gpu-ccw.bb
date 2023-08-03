SUMMARY = "S390x virtio-gpu ccw device for QEMU"
DESCRIPTION = "This package contains a module providing the s390x virtio gpu ccw device for \
QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-s390x-virtio-gpu-ccw-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "210909783dc3422ff9b875406c067b1f3e72ee640a38e98daab8a3a6b8d76a9617c38cd44014059f330239a36344e43fee443fcb6823e0d0b9944fc22ea0bd32"

RPROVIDES:${PN} += "qemu-hw-s390x-virtio-gpu-ccw"

RDEPENDS:${PN} += "qemu-hw-display-virtio-gpu"

inherit rpm
