SUMMARY = "Haskell base-compat profiling library"
DESCRIPTION = "This package provides the Haskell base-compat profiling library."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "ghc-base-compat-prof-0.13.0-1.5.aarch64.rpm"
RPM_HASH = "39d56ca9505b5e8befa56fb03a63fbc9251b90cd382baf5394bfa92a383a5e2c9b992809137e27019f65248d295e397d79b7d606c7148e30c18ba6207bcce70c"

RPROVIDES:${PN} += "ghc-base-compat-prof \
ghc-prof-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1"

RDEPENDS:${PN} += "ghc-base-compat-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-unix-2.7.3"

inherit rpm
