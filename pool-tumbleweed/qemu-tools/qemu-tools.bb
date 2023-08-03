SUMMARY = "Tools for QEMU"
DESCRIPTION = "This package contains various QEMU related tools, including a bridge helper, \
a virtfs helper, ivshmem, disk utilities and scripts for various purposes."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-tools-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "a05ba7a01fa131837e8314fb690439cd67e247fcb68a03f8fd529af3d279a71261b9bf3317629ede41415003606a9eb8bfd0648fe956a7186a8ae39286ca192a"

RPROVIDES:${PN} += "config-qemu-tools \
qemu-tools"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
group-kvm \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libm.so.6 \
libnuma.so.1 \
libxkbcommon.so.0 \
permissions \
qemu-img \
qemu-pr-helper \
virtiofsd"

inherit rpm
