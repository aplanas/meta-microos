SUMMARY = "Haskell transformers-compat profiling library"
DESCRIPTION = "This package provides the Haskell transformers-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "ghc-transformers-compat-prof-0.7.2-2.6.aarch64.rpm"
RPM_HASH = "77b386eb41f94320a3d5aa68fc3f4b5a502ce4ee2f9c5068c59bcab80fb9a0ffca180f5c9351d5edd9f12aa12594adca244bf437fc0c6bc0598cce6e3d7a7ec7"

RPROVIDES:${PN} += "ghc-prof-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-transformers-compat-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-transformers-0.5.6.2 \
ghc-transformers-compat-devel"

inherit rpm
