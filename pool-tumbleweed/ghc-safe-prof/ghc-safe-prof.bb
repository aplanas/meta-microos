SUMMARY = "Haskell safe profiling library"
DESCRIPTION = "This package provides the Haskell safe profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.19"

RPM_NAME = "ghc-safe-prof-0.3.19-4.3.aarch64.rpm"
RPM_HASH = "3934e847fdef231017e9faaa40c83a8b6b6cebbc0e400284a33f460421cf7828a8a91948ecddf474b5a28e8f912f0f0e9a2cc09995e8b528e53ded3284b7e07e"

RPROVIDES:${PN} += "ghc-prof(safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds) \
ghc-safe-prof \
ghc-safe-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-safe-devel"

inherit rpm
