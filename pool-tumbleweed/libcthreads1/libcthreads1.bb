SUMMARY = "Library for C thread functions"
DESCRIPTION = "A library for C thread functions. \
 \
libcthreads is part of the libyal library collection"
LICENSE = "LGPL-3.0-or-later"

PV = "20220102"

RPM_NAME = "libcthreads1-20220102-3.3.aarch64.rpm"
RPM_HASH = "b0379b3208564a290ab15f8843616800e1dcac1258ee4a025a4b12fd5a6760bb4039f6b86a55d9bd01a6453f1ce6e8936f34f260782247cc74c26bc12084ea87"

RPROVIDES:${PN} += "libcthreads.so.1 \
libcthreads1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
