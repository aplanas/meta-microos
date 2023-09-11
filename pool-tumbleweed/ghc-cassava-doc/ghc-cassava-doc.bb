SUMMARY = "Haskell cassava library documentation"
DESCRIPTION = "This package provides the Haskell cassava library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.3.0"

RPM_NAME = "ghc-cassava-doc-0.5.3.0-5.1.noarch.rpm"
RPM_HASH = "bd1871f77f6e5182802c4babdb4ef8bf8932ac8997fe80089572b852ac3f8a6ae63b450bd2d06c3e77c0f0de85a972500490e671b21ad49fcef36f5731fe679d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cassava-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
