SUMMARY = "QEMU disk image utility"
DESCRIPTION = "This package provides command line tools for manipulating disk images."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.3"

RPM_NAME = "qemu-img-8.0.3-1.1.aarch64.rpm"
RPM_HASH = "639cae6f35f411636e25e2dd85b754e69b625b9402779a717324e2a331b6ac379eb122b169043f4160ed60d6413d0f4678be5c80e42ae24f73bec2853acea608"

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
