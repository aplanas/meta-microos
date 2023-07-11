SUMMARY = "direct Network File System support for QEMU"
DESCRIPTION = "This package contains a module for directly accessing nfs based image files \
for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-block-nfs-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "d3295d54c0509eaff0aa70309902618b54de20a585297900c3c12fe0fedf3df712c1eecbfacce18472b356bba68742dd1c9d21cd8d7d9a62e4d919daba353953"

RPROVIDES:${PN} += "qemu-block-nfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnfs.so.14"

inherit rpm
