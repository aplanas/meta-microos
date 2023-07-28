SUMMARY = "Inter-VM Shared Memory Tools for QEMU"
DESCRIPTION = "This package contains a sample shared memory client and server which utilize \
QEMU's Inter-VM shared memory device as specified by the ivshmem client-server \
protocol specification documented in docs/specs/ivshmem-spec.txt in QEMU source \
code."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-ivshmem-tools-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "c37fe1017afd951ef0d9b1b3153355da1930cb76237f0f57efce7eda76f93bc2790961d9efd8503058df740ebad62fbb8c60c1e858db7b937ff382d18f3f0058"

RPROVIDES:${PN} += "qemu-ivshmem-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libnuma.so.1"

inherit rpm
