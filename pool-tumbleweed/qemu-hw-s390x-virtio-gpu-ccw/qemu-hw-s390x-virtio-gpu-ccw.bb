SUMMARY = "S390x virtio-gpu ccw device for QEMU"
DESCRIPTION = "This package contains a module providing the s390x virtio gpu ccw device for \
QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-s390x-virtio-gpu-ccw-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "b24e0b634274002a76bfe40a7485b8fe19f5b8a5cc71df2a4358318e3bcbd6ae5bfdce73a23a86ef255ad8b64d59a2989eeaff966c07cbf49b82a884112409ee"

RPROVIDES:${PN} += "qemu-hw-s390x-virtio-gpu-ccw"

RDEPENDS:${PN} += "qemu-hw-display-virtio-gpu"

inherit rpm
