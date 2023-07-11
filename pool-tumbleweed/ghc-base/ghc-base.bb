SUMMARY = "Haskell base library"
DESCRIPTION = "This package provides the Haskell base library."
LICENSE = "BSD-3-Clause"

PV = "4.17.1.0"

RPM_NAME = "ghc-base-4.17.1.0-3.2.aarch64.rpm"
RPM_HASH = "98322b46b3ef28cfec4ccbfa8ec11c7fe26afc80f192042f2789ac52c882c0cfb24b51135c23596da71c5f8097334a09db8267993c8199ec1aba2118d8c3f80a"

RPROVIDES:${PN} += "ghc-base \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSinteger-gmp-1.1-ghc9.4.5.so \
libHSrts-1.0.2-debug-ghc9.4.5.so \
libHSrts-1.0.2-ghc9.4.5.so \
libHSrts-1.0.2-thr-debug-ghc9.4.5.so \
libHSrts-1.0.2-thr-ghc9.4.5.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
