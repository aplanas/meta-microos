SUMMARY = "Rados Block Device (Ceph) support for QEMU"
DESCRIPTION = "This package contains a module for accessing ceph (rbd,rados) image files \
for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-block-rbd-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "6127801a7c2c8ced8a85b7a22541f87ad3d63be80f0ac88839211b7e1a7f8daad4496f2062cc032c3fab2b4996f55a330de6511d715b941e66b020b4e990c22a"

RPROVIDES:${PN} += "qemu-block-rbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librados.so.2 \
librbd.so.1"

inherit rpm
