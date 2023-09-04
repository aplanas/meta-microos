SUMMARY = "Haskell type-equality profiling library"
DESCRIPTION = "This package provides the Haskell type-equality profiling library."
LICENSE = "BSD-3-Clause"

PV = "1"

RPM_NAME = "ghc-type-equality-prof-1-11.3.aarch64.rpm"
RPM_HASH = "e25e0c3d82d6227304bc5b20a49005827b69aa0a2dbed7cbc1d6728a357b3fecb7a8635b9ae8c72b7df4e587ae53ca9f449d84cd169079f2db5d4184e52cc994"

RPROVIDES:${PN} += "ghc-prof-type-equality-1-GeDZojRKCH6645jDbV5JLU \
ghc-type-equality-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-type-equality-devel"

inherit rpm
