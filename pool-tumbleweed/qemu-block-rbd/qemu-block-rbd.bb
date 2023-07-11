SUMMARY = "Rados Block Device (Ceph) support for QEMU"
DESCRIPTION = "This package contains a module for accessing ceph (rbd,rados) image files \
for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-block-rbd-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "77441b42fe2899ef3baf49808c0bd5c7c38accbd58803a400d4f6395a47cc58517e7187f4a6b57259b1b35f614c3982d7ddf21615bc79fc1839f4419781e54c5"

RPROVIDES:${PN} += "qemu-block-rbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librados.so.2 \
librbd.so.1"

inherit rpm
