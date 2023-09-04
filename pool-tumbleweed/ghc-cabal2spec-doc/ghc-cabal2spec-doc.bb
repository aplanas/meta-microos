SUMMARY = "Haskell cabal2spec library documentation"
DESCRIPTION = "This package provides the Haskell cabal2spec library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.0"

RPM_NAME = "ghc-cabal2spec-doc-2.7.0-1.5.noarch.rpm"
RPM_HASH = "bbfbbbd9246f7747ac60dfcd78e5f7501b72d85018a0ec7cc69d12e6a854858778968908256902c4b4c7984defd8ad629be0f79af93984351dd4e9b042cce862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal2spec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
