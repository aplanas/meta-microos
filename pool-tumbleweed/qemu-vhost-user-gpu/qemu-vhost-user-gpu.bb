SUMMARY = "Vhost user mode virtio-gpu 2D/3D rendering backend for QEMU"
DESCRIPTION = "This package contains a vhost user mode virtio-gpu 2D/3D rendering backend for \
QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-vhost-user-gpu-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "b54ddef467de83a385c48b11b68e183cee523414a463d510373478a47fbf5b651a95085830c4400972ce58d880c2d20b2eee7b4532d85c1fc2b0271e8b66b56d"

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
