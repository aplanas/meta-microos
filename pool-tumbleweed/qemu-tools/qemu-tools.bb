SUMMARY = "Tools for QEMU"
DESCRIPTION = "This package contains various QEMU related tools, including a bridge helper, \
a virtfs helper, ivshmem, disk utilities and scripts for various purposes."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-tools-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "099c9646c44e0c47d39cde03015f3464b15a414dcf59690b09960bb2afaa0727fffa9d14723145750eebb0cc6c0f3408168dd5ba37ab6ccd486fdc8af73f9726"

RPROVIDES:${PN} += "config-qemu-tools \
qemu-tools"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
group-kvm \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libcap-ng.so.0 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libm.so.6 \
libmpathpersist.so.0 \
libnuma.so.1 \
libpam.so.0 \
libselinux.so.1 \
libudev.so.1 \
liburing.so.2 \
libxkbcommon.so.0 \
libz.so.1 \
libzstd.so.1 \
permissions \
virtiofsd"

inherit rpm
