SUMMARY = "QEMU disk image utility"
DESCRIPTION = "This package provides command line tools for manipulating disk images."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-img-8.0.3-2.1.aarch64.rpm"
RPM_HASH = "b82d6d5497c31caea4cd7490ead9e835e967e4336bfaf1bb7162315e22601f7009d5f19d9f7173525ab0149670a82277356a3044033cd32b534cbe9190e0979e"

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
