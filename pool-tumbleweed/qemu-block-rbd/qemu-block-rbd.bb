SUMMARY = "Rados Block Device (Ceph) support for QEMU"
DESCRIPTION = "This package contains a module for accessing ceph (rbd,rados) image files \
for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-block-rbd-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "9fd7af304a8e4ca06438f2be1c3feba69828b0d58c12627abb20dacf9989a3b84589539e0f328374b7d1f46111fb63fe4733a87338b41d945c2ebf4a476d9d83"

RPROVIDES:${PN} += "qemu-block-rbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librados.so.2 \
librbd.so.1"

inherit rpm
