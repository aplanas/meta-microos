SUMMARY = "Haskell cereal profiling library"
DESCRIPTION = "This package provides the Haskell cereal profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-prof-0.5.8.3-2.6.aarch64.rpm"
RPM_HASH = "6471d068bca8a58278ce4133f22d0dd1252fc1ca048cca6ca8be66b57852fe3b467f2a5272f9ff4e56da1fb3c226cdf36e20f5c9f0e0827551413b43690c5d1e"

RPROVIDES:${PN} += "ghc-cereal-prof \
ghc-prof-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f"

RDEPENDS:${PN} += "ghc-cereal-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.0"

inherit rpm
