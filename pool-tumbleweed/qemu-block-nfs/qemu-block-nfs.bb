SUMMARY = "direct Network File System support for QEMU"
DESCRIPTION = "This package contains a module for directly accessing nfs based image files \
for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-block-nfs-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "d583ac7e113ee954318b6b0d2b2f4807b4228459fb4997c2e83d1cfc9e6753f8b3b63fd3376b54e8277b552fca4743caf8106ca4266dcdf6a94d726b99a62eb7"

RPROVIDES:${PN} += "qemu-block-nfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfs.so.14"

inherit rpm
