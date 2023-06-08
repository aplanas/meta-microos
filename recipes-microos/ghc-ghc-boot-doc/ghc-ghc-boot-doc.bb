SUMMARY = "Haskell ghc-boot library documentation"
DESCRIPTION = "This package provides the Haskell ghc-boot library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-doc-9.4.5-1.1.noarch.rpm"
RPM_HASH = "b635562627a8393e7a7ebe32e0d591226636240c104cd0db33467c9884e627e5e576279aff8ce49e792d75bce402bc287039a8bbed41f53ee3db573ba615774f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-boot-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
