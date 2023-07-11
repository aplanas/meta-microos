SUMMARY = "Virtio GPU display support for QEMU"
DESCRIPTION = "This package contains a module for Virtio GPU display support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-display-virtio-gpu-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "e0b58e47c204979aecf0e9d814255f662436fb5b9057a94761df2e502c6a02320ab68665a7ca15c773b5659871c86ca405a79f9f3e98ff3154bb7f955b10d9df"

RPROVIDES:${PN} += "qemu-hw-display-virtio-gpu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libvirglrenderer.so.1"

inherit rpm
