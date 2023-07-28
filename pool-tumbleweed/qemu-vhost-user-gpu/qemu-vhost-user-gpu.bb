SUMMARY = "Vhost user mode virtio-gpu 2D/3D rendering backend for QEMU"
DESCRIPTION = "This package contains a vhost user mode virtio-gpu 2D/3D rendering backend for \
QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-vhost-user-gpu-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "64c5c52f1ca0c384935527bc2b43227f3bd0b4f1d8173df3d78421646658140c248e0bb4806ec093b6ffd149cc06754ca23570698d08aa0b6ad6880a11356982"

RPROVIDES:${PN} += "qemu-vhost-user-gpu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgbm.so.1 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libnuma.so.1 \
libpixman-1.so.0 \
libvirglrenderer.so.1"

inherit rpm
