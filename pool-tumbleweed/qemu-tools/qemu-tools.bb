SUMMARY = "Tools for QEMU"
DESCRIPTION = "This package contains various QEMU related tools, including a bridge helper, \
a virtfs helper, ivshmem, disk utilities and scripts for various purposes."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-tools-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "429f1e1e5364403a6dea1e38d7ffb00b50c0f7f0d16534e15d61fd324154d23102c952b833ad9bb3693b371da7a3f08e83a58ab26ee1388b7d1d114a15733e72"

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
