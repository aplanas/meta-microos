SUMMARY = "List mount points"
DESCRIPTION = "Lists currently mounted filesystems. \
 \
Works on: Linux, BSD, Mac OS X, Android."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-1.0.2-4.3.aarch64.rpm"
RPM_HASH = "38eecb35bba0eef7ecf3d300fdc387def345a172612a69bd4e2e0d85a77f1afb4ab74b4829bf7d9edfb6c9fc9709425abf1c0341f7cd0f22ca6b574c8fffcc25"

RPROVIDES:${PN} += "ghc-mountpoints \
libHSmountpoints-1.0.2-1s316lA2PKMJiFY8pZCQYD-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
