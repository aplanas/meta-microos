SUMMARY = "Haskell optics-core profiling library"
DESCRIPTION = "This package provides the Haskell optics-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-optics-core-prof-0.4.1.1-1.2.aarch64.rpm"
RPM_HASH = "3b38fc6ab1213cbd6c908acfd1938d4e4cdddd31ad7fdbf163a5de5ad155b7304fb1394668b87f565eb76a51b44734d960c0d0908796b2cf52eb34eb1fa3feff"

RPROVIDES:${PN} += "ghc-optics-core-prof \
ghc-prof-optics-core-0.4.1.1-JC1QypotRRZA0HNSE7diFW"

RDEPENDS:${PN} += "ghc-optics-core-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-indexed-profunctors-0.1.1.1-6bLFHbFbToS4H5mdmvIfka \
ghc-prof-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-prof-transformers-0.5.6.2"

inherit rpm
