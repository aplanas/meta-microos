SUMMARY = "Vhost user mode virtio-gpu 2D/3D rendering backend for QEMU"
DESCRIPTION = "This package contains a vhost user mode virtio-gpu 2D/3D rendering backend for \
QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-vhost-user-gpu-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "aced057145d03a582f37b5a0cc72afbe3b2bc6affd16ad3287eb5c81101bc1c30d1ea1494a26302af9dfdf77791f20af71a57cb594ae4bbf3b9423bb5189fcd9"

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
