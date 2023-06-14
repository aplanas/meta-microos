SUMMARY = "Library for C thread functions"
DESCRIPTION = "A library for C thread functions. \
 \
libcthreads is part of the libyal library collection"
LICENSE = "LGPL-3.0-or-later"

PV = "20220102"

RPM_NAME = "libcthreads1-20220102-3.2.aarch64.rpm"
RPM_HASH = "20d635a756aa8543a4ea73447336f0a3ebc88557ee2913ceb948814ec6db5f9484884d7fcef5b09c2add36a1da70a5ea0119072c57ae93fee3e326d7d2789dd8"

RPROVIDES:${PN} += "libcthreads.so.1 \
libcthreads1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
