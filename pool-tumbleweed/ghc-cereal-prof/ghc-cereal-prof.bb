SUMMARY = "Haskell cereal profiling library"
DESCRIPTION = "This package provides the Haskell cereal profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-prof-0.5.8.3-2.3.aarch64.rpm"
RPM_HASH = "7d87f3d406393259081f27f70871d013a21b62d338f383804f1a853a3fdab757138762175dffdc3f525e650cf6e74b36c4f79d6acb9f83a704840007bb378552"

RPROVIDES:${PN} += "ghc-cereal-prof \
ghc-prof-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f"

RDEPENDS:${PN} += "ghc-cereal-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.0"

inherit rpm
