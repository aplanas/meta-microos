SUMMARY = "Rados Block Device (Ceph) support for QEMU"
DESCRIPTION = "This package contains a module for accessing ceph (rbd,rados) image files \
for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-block-rbd-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "b5eae16be4b0bc306c88db973e47223d1a95b35470db9ed54b5f7c437c6d6e3d78283100da0c4b35c8dd12206376025cb2819a8a35667d69034e9b686ca9f793"

RPROVIDES:${PN} += "qemu-block-rbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librados.so.2 \
librbd.so.1"

inherit rpm
