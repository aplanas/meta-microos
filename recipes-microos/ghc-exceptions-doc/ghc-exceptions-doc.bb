SUMMARY = "Haskell exceptions library documentation"
DESCRIPTION = "This package provides the Haskell exceptions library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-doc-0.10.5-1.1.noarch.rpm"
RPM_HASH = "267977900f4f8c10ca9c2fbb920a6cd81166fb35003b3487a480a9a3cac88f786c7f5431dd9dda3e8433278ddec28408073479adbd2dbf06cc3d6e8613189dfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-exceptions-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
