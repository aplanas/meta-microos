SUMMARY = "GlusterFS's core library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libglusterfs0-11.0-3.1.aarch64.rpm"
RPM_HASH = "db8df703fbca2f55ebf4751311c065b28a2477663e509c2b9d7aca8e110d2805d20691eed67393e41f5926a7a8b9ac65becf9cf4763fce7b1a097b92adcef93e"

RPROVIDES:${PN} += "libglusterfs.so.0 \
libglusterfs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libuuid.so.1 \
libz.so.1"

inherit rpm
