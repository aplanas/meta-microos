SUMMARY = "Time library"
DESCRIPTION = "This package provides the old time library. \
 \
For new projects, the newer <http://hackage.haskell.org/package/time time \
library> is recommended."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.3"

RPM_NAME = "ghc-old-time-1.1.0.3-13.2.aarch64.rpm"
RPM_HASH = "8ca87e226bf5ddbf2e1aa5edd2bf192dd98e80d69a14e3d1cc3fb8e60586fbaf91660f769d93a89e3991b70433bc96ee29ad1a1a0523c9c1f217c7d1b5595f44"

RPROVIDES:${PN} += "ghc-old-time \
ghc-old-time(aarch-64) \
libHSold-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSold-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
