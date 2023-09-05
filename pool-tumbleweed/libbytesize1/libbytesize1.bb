SUMMARY = "A library for working with sizes in bytes"
DESCRIPTION = "The LibBytesize is a C library that facilitates work with sizes in \
bytes, be it parsing the input from users or producing a human-readable \
representation of a size in bytes. This library takes localization into \
account. It also provides support for sizes bigger than MAXUINT64."
LICENSE = "LGPL-2.1-only"

PV = "2.9"

RPM_NAME = "libbytesize1-2.9-1.1.aarch64.rpm"
RPM_HASH = "a73c227689c1e5012d58fda6fdd3d2b121437fd012a899728969bfb58a500320cbfcd9a2d2a44ba9f266707431b04894d7971a20129312f67e20fcdd09835f17"

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
