SUMMARY = "Inter-VM Shared Memory Tools for QEMU"
DESCRIPTION = "This package contains a sample shared memory client and server which utilize \
QEMU's Inter-VM shared memory device as specified by the ivshmem client-server \
protocol specification documented in docs/specs/ivshmem-spec.txt in QEMU source \
code."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ivshmem-tools-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "7217cb182cbd12a6e884ae95fbc608b7b514dc7f98156458e853d8404ff8871287678e5128024281bccd87fcbb7ad2c0c4d77cb236b90880cacd278ad877e6db"

RPROVIDES:${PN} += "qemu-ivshmem-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libnuma.so.1"

inherit rpm
