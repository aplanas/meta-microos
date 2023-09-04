SUMMARY = "direct Network File System support for QEMU"
DESCRIPTION = "This package contains a module for directly accessing nfs based image files \
for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-block-nfs-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "f29bd6d850cc4d21673f9778042ecd0092269bb8d335d4f27e64ffc908ed08019a193b17d7c0d394aec9259311ecd55b3fd7ac2686fc33324f69d575c8903d22"

RPROVIDES:${PN} += "qemu-block-nfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfs.so.14"

inherit rpm
