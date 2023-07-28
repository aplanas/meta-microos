SUMMARY = "S390x virtio-gpu ccw device for QEMU"
DESCRIPTION = "This package contains a module providing the s390x virtio gpu ccw device for \
QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-s390x-virtio-gpu-ccw-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "1ddfd0668f5f592ee749728a8745a3f8093adabb4677595c75139dc87580eb675baa65a164b4773068d20a62052b9090f6d9f544585783154dd1862cf39df54d"

RPROVIDES:${PN} += "qemu-hw-s390x-virtio-gpu-ccw"

RDEPENDS:${PN} += "qemu-hw-display-virtio-gpu"

inherit rpm
