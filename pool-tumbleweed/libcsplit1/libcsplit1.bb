SUMMARY = "Library for C split string functions"
DESCRIPTION = "Library for C split string functions. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220109"

RPM_NAME = "libcsplit1-20220109-3.2.aarch64.rpm"
RPM_HASH = "7a550de6747c4d05368b5ecab638ab26fa06de95ce97435522b1bd3e1a064a128f0733b49efd395ccf80b8d37c57b5f2c71bbc38890bbaf3cf287fc59482bc77"

RPROVIDES:${PN} += "libcsplit.so.1 \
libcsplit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
