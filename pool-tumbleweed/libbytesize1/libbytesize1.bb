SUMMARY = "A library for working with sizes in bytes"
DESCRIPTION = "The LibBytesize is a C library that facilitates work with sizes in \
bytes, be it parsing the input from users or producing a human-readable \
representation of a size in bytes. This library takes localization into \
account. It also provides support for sizes bigger than MAXUINT64."
LICENSE = "LGPL-2.1-only"

PV = "2.8"

RPM_NAME = "libbytesize1-2.8-1.2.aarch64.rpm"
RPM_HASH = "89818a6e680a0ab47793cf207758004bf7dfeb99ef37d2d1dc05f10579087ce05aff65a01be6914b34b1beafdb536421c2566712bf571296b6e15ccf938801e4"

RPROVIDES:${PN} += "libbytesize \
libbytesize.so.1 \
libbytesize1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libmpfr.so.6 \
libpcre2-8.so.0"

inherit rpm
