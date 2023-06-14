SUMMARY = "Haskell base profiling library"
DESCRIPTION = "This package provides the Haskell base profiling library."
LICENSE = "BSD-3-Clause"

PV = "4.17.1.0"

RPM_NAME = "ghc-base-prof-4.17.1.0-3.1.aarch64.rpm"
RPM_HASH = "d3420aff20a0f529ca5c2d5c4364150bd74d8d29a9295797ec4fb350cc3b66fc0e38ba961aa77a204fb7a66d949b5f6434e201ec96fffe41bd44ed51cc9baeb1"

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
