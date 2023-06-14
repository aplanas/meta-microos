SUMMARY = "List mount points"
DESCRIPTION = "Lists currently mounted filesystems. \
 \
Works on: Linux, BSD, Mac OS X, Android."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-1.0.2-4.2.aarch64.rpm"
RPM_HASH = "e5a8a377c8537ab3a43214e668766ab14e24fa5f738c09d44640cae0afe016b9be2bc188629dd84765433bb2810c16867bc0764196041dbf243ab4653ceda94c"

RPROVIDES:${PN} += "ghc-mountpoints \
libHSmountpoints-1.0.2-1s316lA2PKMJiFY8pZCQYD-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
