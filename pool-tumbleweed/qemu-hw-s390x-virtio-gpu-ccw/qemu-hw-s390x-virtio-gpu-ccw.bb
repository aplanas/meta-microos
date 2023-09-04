SUMMARY = "S390x virtio-gpu ccw device for QEMU"
DESCRIPTION = "This package contains a module providing the s390x virtio gpu ccw device for \
QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-hw-s390x-virtio-gpu-ccw-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "3ed2e5d808bfb3caf28410925eca6ade8d9c37f3d2f1ec09f3bdb0adf85dd2719ab4dad5ebb85d5c30807d96c8dd23ead2d063419f21a8e6ae24466432308650"

RPROVIDES:${PN} += "qemu-hw-s390x-virtio-gpu-ccw"

RDEPENDS:${PN} += "qemu-hw-display-virtio-gpu"

inherit rpm
