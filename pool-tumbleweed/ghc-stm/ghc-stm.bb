SUMMARY = "Haskell stm library"
DESCRIPTION = "This package provides the Haskell stm library."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-2.5.1.0-1.1.aarch64.rpm"
RPM_HASH = "316af13a335d39e8656179d4951d31cf83413309ccf57d6146f8af518a58846128ed02f5b5ce9b94f2abe1e9e31135e5078d741b180fd1778bfeb67d069384c3"

RPROVIDES:${PN} += "ghc-stm \
libHSstm-2.5.1.0-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
