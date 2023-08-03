SUMMARY = "Virtio GPU display support for QEMU"
DESCRIPTION = "This package contains a module for Virtio GPU display support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-display-virtio-gpu-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "6f28512d9b7c3340ac34ea3fc46abdd9b128c1a42672aeb7bb0ad9bea5f4439df13b0a4ffcdf3aae7ddb19d64d5a9446210e7832f1a2c0c0a1cc33612afa7615"

RPROVIDES:${PN} += "qemu-hw-display-virtio-gpu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libvirglrenderer.so.1"

inherit rpm
