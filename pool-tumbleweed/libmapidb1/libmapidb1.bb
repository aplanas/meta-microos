SUMMARY = "Library for MAPI data types"
DESCRIPTION = "A library for accessing the Exchange MAPI database format \
 \
libmapidb is part of the libyal library collection"
LICENSE = "LGPL-3.0-or-later"

PV = "20210421"

RPM_NAME = "libmapidb1-20210421-2.3.aarch64.rpm"
RPM_HASH = "cbe1b23cad9fc2ad64b1c41a91ea638fae323f4bf187f14dcf16f5f90f0dc8613c99c101e8547b8e5b64792c3bb248087164648c7222e1328e8f38c32b001f4f"

RPROVIDES:${PN} += "libmapidb.so.1 \
libmapidb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcerror.so.1"

inherit rpm
