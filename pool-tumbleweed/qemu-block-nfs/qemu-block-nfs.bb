SUMMARY = "direct Network File System support for QEMU"
DESCRIPTION = "This package contains a module for directly accessing nfs based image files \
for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-block-nfs-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "d9429d4f3d0bd12dac9969c31f92bf5accb04e85d2c6db070571de7349bd3d626b2d43302f845660e795718f8633f39f9a751b6935c513e8d6eaf24165876a3f"

RPROVIDES:${PN} += "qemu-block-nfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfs.so.14"

inherit rpm
