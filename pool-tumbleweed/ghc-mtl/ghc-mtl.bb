SUMMARY = "Haskell mtl library"
DESCRIPTION = "This package provides the Haskell mtl library."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-2.2.2-1.1.aarch64.rpm"
RPM_HASH = "9ddb7bf327f7a2d5525e3cfd3424d32d5d4e9e2f5f2e881b0157d1cc5b293ebe3027a8568bfd6f888a7c2467fc2d7c6c66efabcb71e8b8247e31120970cb0496"

RPROVIDES:${PN} += "ghc-mtl \
libHSmtl-2.2.2-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
