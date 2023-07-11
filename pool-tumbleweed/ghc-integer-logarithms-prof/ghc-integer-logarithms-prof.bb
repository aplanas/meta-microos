SUMMARY = "Haskell integer-logarithms profiling library"
DESCRIPTION = "This package provides the Haskell integer-logarithms profiling library."
LICENSE = "MIT"

PV = "1.0.3.1"

RPM_NAME = "ghc-integer-logarithms-prof-1.0.3.1-6.5.aarch64.rpm"
RPM_HASH = "55034824546a06ebe855b95fbf325266ed71f8fa0a7d17124d4fec66f8c7cf874a54d956f42cff294628146c18cc7a6a9f3a31823b6f61773f3a84c3a7de5b60"

RPROVIDES:${PN} += "ghc-integer-logarithms-prof \
ghc-prof-integer-logarithms-1.0.3.1-Hm9v2fsfG1DA5soPSLssZu"

RDEPENDS:${PN} += "ghc-integer-logarithms-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-ghc-bignum-1.3 \
ghc-prof-ghc-prim-0.9.0"

inherit rpm
