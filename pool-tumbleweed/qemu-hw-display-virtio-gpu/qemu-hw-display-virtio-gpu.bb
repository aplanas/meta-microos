SUMMARY = "Virtio GPU display support for QEMU"
DESCRIPTION = "This package contains a module for Virtio GPU display support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-hw-display-virtio-gpu-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "1b4f83eb1fd9490a5f57903a3a4b27bafb2f9c40b6cf5fc794cd927bb8b05024900ae5cf289d74794b8ca76299ae336ec94fc396211e4300ad326cff3321628f"

RPROVIDES:${PN} += "qemu-hw-display-virtio-gpu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libvirglrenderer.so.1"

inherit rpm
