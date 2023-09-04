SUMMARY = "Haskell mime-types library documentation"
DESCRIPTION = "This package provides the Haskell mime-types library documentation."
LICENSE = "MIT"

PV = "0.1.1.0"

RPM_NAME = "ghc-mime-types-doc-0.1.1.0-2.3.noarch.rpm"
RPM_HASH = "7b8d459197919ca6ca091acf03cd3153ec4f27b15ac8e57563351f02aa8aa7cad259b285603a763c80d56e7bc674717b173e4483ad1a1e441f071e242f89ecce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mime-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
