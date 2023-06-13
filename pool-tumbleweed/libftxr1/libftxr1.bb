SUMMARY = "Library for Transactional Registry (TxR) data types"
DESCRIPTION = "libftxr is a library for Transactional Registry (TxR) data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220118"

RPM_NAME = "libftxr1-20220118-3.2.aarch64.rpm"
RPM_HASH = "a652750dd7b2f8a0c4c978154e460595b619a58849f2a2cc835605b4fe58427a3575ad0ea7e64085385946e75065e493b82579e3865050b29d10caad22a9007f"

RPROVIDES:${PN} += "libftxr.so.1()(64bit) \
libftxr.so.1(V_20220118)(64bit) \
libftxr1 \
libftxr1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit)"

inherit rpm
