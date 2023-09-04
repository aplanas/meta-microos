SUMMARY = "Haskell deriving-aeson library documentation"
DESCRIPTION = "This package provides the Haskell deriving-aeson library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "ghc-deriving-aeson-doc-0.2.9-3.1.noarch.rpm"
RPM_HASH = "21bfc64da6c36f67e0633a012a3eeb97cb24ddbbbb1134c787b8d708238ebaa57855b152de3922bdd0b34f6511931e24901051b889d4251c3a4dd0771915a920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-deriving-aeson-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
