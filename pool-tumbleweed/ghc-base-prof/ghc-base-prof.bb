SUMMARY = "Haskell base profiling library"
DESCRIPTION = "This package provides the Haskell base profiling library."
LICENSE = "BSD-3-Clause"

PV = "4.17.1.0"

RPM_NAME = "ghc-base-prof-4.17.1.0-3.2.aarch64.rpm"
RPM_HASH = "511a1ecbce0e024eeaed8ab67c7f0033eb4a9642a81084e1499faa649df734fdbc71121b17143d3f17ae2c8c7490cfb84b473a990c6e7f67880b3c4b5d7dcde7"

RPROVIDES:${PN} += "ghc-base-prof \
ghc-prof-base-4.17.1.0 \
ghc-prof-ghc-bignum-1.3 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-integer-gmp-1.1 \
ghc-prof-rts-1.0.2"

RDEPENDS:${PN} += "ghc-base-devel \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
