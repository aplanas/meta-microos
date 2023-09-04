SUMMARY = "QEMU disk image utility"
DESCRIPTION = "This package provides command line tools for manipulating disk images."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.4"

RPM_NAME = "qemu-img-8.0.4-1.1.aarch64.rpm"
RPM_HASH = "d21994755f904ac4b5ceb73f5ef44bc0b3a36139ba01e34196c65ea73d333dde01ba1890da09f7cb8385f30c4c9173a307dc939b7273a603910154beee7a3185"

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
