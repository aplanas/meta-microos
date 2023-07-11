SUMMARY = "Library for MAPI data types"
DESCRIPTION = "A library for MAPI data types. \
 \
libfmapi is part of the libyal library collection"
LICENSE = "LGPL-3.0-or-later"

PV = "20230408"

RPM_NAME = "libfmapi1-20230408-1.3.aarch64.rpm"
RPM_HASH = "7dadcce7b0d83620c4fb2c725b14cec52b2210caa83684cd2a665b43c73e88ae8f1edbca4f85d46853b222dee17f06ebd04717f76b84992e343e5ee4286f08f8"

RPROVIDES:${PN} += "libfmapi.so.1 \
libfmapi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libuna.so.1"

inherit rpm
