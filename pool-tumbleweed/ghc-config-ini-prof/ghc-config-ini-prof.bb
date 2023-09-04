SUMMARY = "Haskell config-ini profiling library"
DESCRIPTION = "This package provides the Haskell config-ini profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.6.0"

RPM_NAME = "ghc-config-ini-prof-0.2.6.0-1.5.aarch64.rpm"
RPM_HASH = "2453f5ae480cc6b8354f19332173ae6c44722de8da5142b71f070f245b2190b638e11ccc5df6ca71b99a81850e35fc01436bdc7d09f1700cc313c636ab0d4f7c"

RPROVIDES:${PN} += "ghc-config-ini-prof \
ghc-prof-config-ini-0.2.6.0-HoJpnqrH2zF9Zc2bv1CbDm"

RDEPENDS:${PN} += "ghc-config-ini-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-megaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn"

inherit rpm
