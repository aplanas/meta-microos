SUMMARY = "Vhost user mode virtio-gpu 2D/3D rendering backend for QEMU"
DESCRIPTION = "This package contains a vhost user mode virtio-gpu 2D/3D rendering backend for \
QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-vhost-user-gpu-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "439ba2d2b02f18afab176d8c8969a257a3ebdf9915a2256abf7f136148666050d2d03367a8c7db71a5465b2c1bdcef6fc2d5060af1bf66774bf59e4324e60951"

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
