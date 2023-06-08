SUMMARY = "Haskell libiserv library documentation"
DESCRIPTION = "This package provides the Haskell libiserv library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-libiserv-doc-9.4.5-1.1.noarch.rpm"
RPM_HASH = "5af651748dcc7c650dc123191d2af8a78aaea7a9c3fc62b6ca7258aab52cba149338d61989e5d4b0c7dee2301d6b5e963a74e4284b659c43668bcf1438c10856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-libiserv-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
