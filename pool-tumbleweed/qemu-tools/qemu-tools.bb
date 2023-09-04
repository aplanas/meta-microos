SUMMARY = "Tools for QEMU"
DESCRIPTION = "This package contains various QEMU related tools, including a bridge helper, \
a virtfs helper, ivshmem, disk utilities and scripts for various purposes."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-tools-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "ddd8745e8df078192369063dca268242f35b72dabac04ffc12c7944b990a56ed03dd868a4f010dd569730de5749e9ab9fd41b6a1f37d6260fbd1b1c652519db0"

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
