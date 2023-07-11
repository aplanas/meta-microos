SUMMARY = "Time library"
DESCRIPTION = "This package provides the old time library. \
 \
For new projects, the newer <http://hackage.haskell.org/package/time time \
library> is recommended."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.3"

RPM_NAME = "ghc-old-time-1.1.0.3-13.3.aarch64.rpm"
RPM_HASH = "801ca86b979798cc745c9c4f125d664d5ac668b19666bf8595fffdd4afec6164f2069e083bb1647f5fe8f697ff4884346169360bfaa504c7f74d088b42df3224"

RPROVIDES:${PN} += "ghc-old-time \
libHSold-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
