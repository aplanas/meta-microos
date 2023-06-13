SUMMARY = "Haskell integer-logarithms profiling library"
DESCRIPTION = "This package provides the Haskell integer-logarithms profiling library."
LICENSE = "MIT"

PV = "1.0.3.1"

RPM_NAME = "ghc-integer-logarithms-prof-1.0.3.1-6.3.aarch64.rpm"
RPM_HASH = "91414ed37c9cca35e5aa5cc7ece176f6e15476734aa5f196bed12e953a8797b84fe2704e521fdf58f67d9ee9ad190a371e0a9a6625941d12b17e7c520a138988"

RPROVIDES:${PN} += "ghc-integer-logarithms-prof \
ghc-integer-logarithms-prof(aarch-64) \
ghc-prof(integer-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu)"

RDEPENDS:${PN} += "ghc-integer-logarithms-devel \
ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(ghc-bignum-1.3) \
ghc-prof(ghc-prim-0.9.0)"

inherit rpm
