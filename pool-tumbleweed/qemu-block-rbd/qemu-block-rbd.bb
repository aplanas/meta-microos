SUMMARY = "Rados Block Device (Ceph) support for QEMU"
DESCRIPTION = "This package contains a module for accessing ceph (rbd,rados) image files \
for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-block-rbd-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "3c209255debb69a0182aacb039584dd03ec2aa215f764d45a3bf86952d7659713a2ebd6662f39d8852a17cb07d8dd0d48e5ccae2202c91605117f9a70b9a489d"

RPROVIDES:${PN} += "qemu-block-rbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librados.so.2 \
librbd.so.1"

inherit rpm
