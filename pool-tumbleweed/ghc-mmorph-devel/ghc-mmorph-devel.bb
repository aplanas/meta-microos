SUMMARY = "Haskell mmorph library development files"
DESCRIPTION = "This package provides the Haskell mmorph library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "ghc-mmorph-devel-1.2.0-4.2.aarch64.rpm"
RPM_HASH = "11c35ab745f1075ead7b82b5077a3d63bd0e4c72183d628421797be2cbd1ec1706007b8d6951966b70524778868074f5d468e1c9e1a4fb7d34e97616160bfb33"

RPROVIDES:${PN} += "ghc-devel-mmorph-1.2.0-4Mt4o3YW9h63uaZAnM2RZC \
ghc-mmorph-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-mmorph"

inherit rpm
