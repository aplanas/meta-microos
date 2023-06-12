SUMMARY = "Haskell megaparsec library development files"
DESCRIPTION = "This package provides the Haskell megaparsec library development files."
LICENSE = "BSD-2-Clause"

PV = "9.3.0"

RPM_NAME = "ghc-megaparsec-devel-9.3.0-1.3.aarch64.rpm"
RPM_HASH = "90fd1419d98e81e5e422d1729108e80b1a6a057506c9e3046059d3bf47dfcee7cdda89bf2ca38215159812e1e6e8b71ff2e70453526e5fc88b849b0820428ee8"

RPROVIDES:${PN} += "ghc-devel(megaparsec-9.3.0-9LuWCOgzW7qD3PYWTEm9Pv) \
ghc-megaparsec-devel \
ghc-megaparsec-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(mtl-2.2.2) \
ghc-devel(parser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt) \
ghc-devel(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) \
ghc-devel(text-2.0.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-megaparsec"

inherit rpm
