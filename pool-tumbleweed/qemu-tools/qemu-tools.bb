SUMMARY = "Tools for QEMU"
DESCRIPTION = "This package contains various QEMU related tools, including a bridge helper, \
a virtfs helper, ivshmem, disk utilities and scripts for various purposes."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-tools-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "b7eea0627528ae1c2d37f26b6975047ccc964cb30f4703a915e3011cb2742b203025e7cb000ee72aa7c61e6ba6b0ecb8ceedd7c41e6845e29d21b15f0ee521a2"

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
