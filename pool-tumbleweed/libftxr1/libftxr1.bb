SUMMARY = "Library for Transactional Registry (TxR) data types"
DESCRIPTION = "libftxr is a library for Transactional Registry (TxR) data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220118"

RPM_NAME = "libftxr1-20220118-3.3.aarch64.rpm"
RPM_HASH = "6cb15c318cf4564978d601a4fed4b16d79252f49c94861e6346e0751cc5f9752da02345808f008717a0a508db9a66f92cdb351990921751db8c4f2770f369d8c"

RPROVIDES:${PN} += "libftxr.so.1 \
libftxr1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcerror.so.1"

inherit rpm
