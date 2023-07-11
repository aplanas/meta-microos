SUMMARY = "Multiplatform Helper Library for Other Libraries"
DESCRIPTION = "Gwenhywfar is a base library used to provide OS abstraction functions \
for Linux, FreeBSD, OpenBSD, NetBSD, and Windows. It also includes \
some often needed functions (for example, for handling and parsing of \
configuration files, reading and writing of XML files, and interprocess \
communication)."
LICENSE = "LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "libgwenhywfar79-5.10.1-1.5.aarch64.rpm"
RPM_HASH = "794e49458631b6f63231d29473243f6a353869c5c7db706a4caf0d5d6580d2dc523209f26478e67e931ab741e7b60aa46de43ffa992d3408aa20590b6ee57a2b"

RPROVIDES:${PN} += "libgwenhywfar.so.79 \
libgwenhywfar79"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnutls.so.30 \
libgpg-error.so.0"

inherit rpm
