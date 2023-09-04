SUMMARY = "Vhost user mode virtio-gpu 2D/3D rendering backend for QEMU"
DESCRIPTION = "This package contains a vhost user mode virtio-gpu 2D/3D rendering backend for \
QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-vhost-user-gpu-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "1ebab7853fdee2baf1a9c6a656abb7205156854cea9ab0d4253c4ba83c4caf6d84a37c302f9dbeb275e46dba876fbd6f70fe2e8729e023866696a6f8726e739e"

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
