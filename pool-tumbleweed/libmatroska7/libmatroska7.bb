SUMMARY = "Library to Deal with Matroska Files"
DESCRIPTION = "Libmatroska is a C++ library to parse Matroska files (.mkv and .mka). \
It depends on libebml to work. You only need this package to compile \
your own applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.1"

RPM_NAME = "libmatroska7-1.7.1-1.4.aarch64.rpm"
RPM_HASH = "517a7bbbd43cd11723a026655c04fdb0fee614fad030300d99f738f82a24a379e4c350d22b0d66aeb895605e7f89c0e90310c8ee684c8bf9dce966f7429d9a66"

RPROVIDES:${PN} += "libmatroska.so.7 \
libmatroska7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libebml.so.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
