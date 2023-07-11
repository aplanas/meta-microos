SUMMARY = "Inter-VM Shared Memory Tools for QEMU"
DESCRIPTION = "This package contains a sample shared memory client and server which utilize \
QEMU's Inter-VM shared memory device as specified by the ivshmem client-server \
protocol specification documented in docs/specs/ivshmem-spec.txt in QEMU source \
code."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-ivshmem-tools-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "a693955d83da8d17ce7917e6dfa8034854cae2a84299516797987e2a79909b3fbada5eceaa0f5a94207846c497be2cb5313316fdcd34dbae1cc87d6365eebf6e"

RPROVIDES:${PN} += "qemu-ivshmem-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libnuma.so.1"

inherit rpm
