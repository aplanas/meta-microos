SUMMARY = "Inter-VM Shared Memory Tools for QEMU"
DESCRIPTION = "This package contains a sample shared memory client and server which utilize \
QEMU's Inter-VM shared memory device as specified by the ivshmem client-server \
protocol specification documented in docs/specs/ivshmem-spec.txt in QEMU source \
code."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-ivshmem-tools-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "8aa785400c5bd670012ba47cf9b11664f5c83060f4521ea9f9d108066d9b67b3369cf4703b5eef3d6e860f4d90024a81135bbdd8999c04a7a033884c2b4704b9"

RPROVIDES:${PN} += "qemu-ivshmem-tools \
qemu-ivshmem-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libnuma.so.1()(64bit) \
libnuma.so.1(libnuma_1.2)(64bit) \
libnuma.so.1(libnuma_1.3)(64bit)"

inherit rpm