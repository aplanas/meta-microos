SUMMARY = "List mount points"
DESCRIPTION = "Lists currently mounted filesystems. \
 \
Works on: Linux, BSD, Mac OS X, Android."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-1.0.2-4.4.aarch64.rpm"
RPM_HASH = "22a6bee20e132e7896392c27b389088744beaa509de64d1601fe7140b66dc2b303a6659462b61707f9c22e90bb8648afbfa00c74f78c70dcfc3dfc2bb58402e7"

RPROVIDES:${PN} += "ghc-mountpoints \
libHSmountpoints-1.0.2-6LGBE5yGg5t52Lw1dci4Pp-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
