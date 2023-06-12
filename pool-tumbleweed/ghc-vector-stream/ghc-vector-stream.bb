SUMMARY = "Efficient Streams"
DESCRIPTION = "Simple yet powerful monadic streams that are used as a backbone for vector \
package fusion functionality."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-vector-stream-0.1.0.0-2.2.aarch64.rpm"
RPM_HASH = "03628d99c589e9ed03c843edfb4ca5d61fa3db02415e590c800d1d4dabc09248f475174e6a214b3424df82e031d54b5b1276c1b8c3cd9dd84140954cf63501c2"

RPROVIDES:${PN} += "ghc-vector-stream \
ghc-vector-stream(aarch-64) \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm