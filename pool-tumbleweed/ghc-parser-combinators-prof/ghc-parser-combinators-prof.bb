SUMMARY = "Haskell parser-combinators profiling library"
DESCRIPTION = "This package provides the Haskell parser-combinators profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-parser-combinators-prof-1.3.0-2.6.aarch64.rpm"
RPM_HASH = "7194ac9a4dd6e3a46ca9743335a7de2718f5b217a28bd11cfa4257fe82ce673752e99b5b756f6dc8dc6b47fc28a0c93eaf51499b8c57e0cabdfbe85169ffd08b"

RPROVIDES:${PN} += "ghc-parser-combinators-prof \
ghc-prof-parser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt"

RDEPENDS:${PN} += "ghc-parser-combinators-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
