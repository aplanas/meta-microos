SUMMARY = "Haskell filepath library"
DESCRIPTION = "This package provides the Haskell filepath library."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-1.4.2.2-1.1.aarch64.rpm"
RPM_HASH = "d64b01203559435921f8f46d6468270d7c414b9464c7cdde9115228a7a4cc05781f1b908c2a6b96074275cb3357a71eee18958893195c8df0045f45bd7381d67"

RPROVIDES:${PN} += "ghc-filepath \
libHSfilepath-1.4.2.2-ghc9.4.6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
