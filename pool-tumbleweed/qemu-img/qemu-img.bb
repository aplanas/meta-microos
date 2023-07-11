SUMMARY = "QEMU disk image utility"
DESCRIPTION = "This package provides command line tools for manipulating disk images."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-img-8.0.2-2.1.aarch64.rpm"
RPM_HASH = "9a60880776fd77f5aa5604ec75721756ec1f6f609e13929b1535b7f463d893c4e2fff8b89161b69ff3e761a48686baca68cb49474bd572ed32a635e07ac448cc"

RPROVIDES:${PN} += "qemu-img"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libm.so.6 \
libnuma.so.1 \
libpam.so.0 \
libselinux.so.1 \
liburing.so.2 \
libz.so.1 \
libzstd.so.1"

inherit rpm
