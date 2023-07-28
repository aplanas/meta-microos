SUMMARY = "Virtio GPU display support for QEMU"
DESCRIPTION = "This package contains a module for Virtio GPU display support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-hw-display-virtio-gpu-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "46d421bcee80208401e8497023f4d28fb2de6cb2097782236b8bf972e358ee6b805169cff306fb289c5d0ee644484426b2709c1fb43284edb90bcbd23d2262e5"

RPROVIDES:${PN} += "qemu-hw-display-virtio-gpu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libvirglrenderer.so.1"

inherit rpm
