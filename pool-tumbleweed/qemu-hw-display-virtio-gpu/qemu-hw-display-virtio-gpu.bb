SUMMARY = "Virtio GPU display support for QEMU"
DESCRIPTION = "This package contains a module for Virtio GPU display support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-hw-display-virtio-gpu-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "de5af5732847b12bf2983cccfd90531b1bf508252cbaf2a300063557c1d9cce6e39c6b28a96c31a29a64fb0c46c46a42a8a065520d0632757ce869ff414bb186"

RPROVIDES:${PN} += "qemu-hw-display-virtio-gpu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libvirglrenderer.so.1"

inherit rpm
