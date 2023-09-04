SUMMARY = "Haskell integer-logarithms profiling library"
DESCRIPTION = "This package provides the Haskell integer-logarithms profiling library."
LICENSE = "MIT"

PV = "1.0.3.1"

RPM_NAME = "ghc-integer-logarithms-prof-1.0.3.1-6.6.aarch64.rpm"
RPM_HASH = "fac0ef279624154a517b456a6a10939bc9cd19fbf9296e3872205ee7893c97ae53f799dd64e3ed4c4102f15d6e8171858975f77c21f31de16ce875cdd74c9144"

RPROVIDES:${PN} += "ghc-integer-logarithms-prof \
ghc-prof-integer-logarithms-1.0.3.1-8hVItVgdqFg1uL8b0gbVZO"

RDEPENDS:${PN} += "ghc-integer-logarithms-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-ghc-bignum-1.3 \
ghc-prof-ghc-prim-0.9.1"

inherit rpm
