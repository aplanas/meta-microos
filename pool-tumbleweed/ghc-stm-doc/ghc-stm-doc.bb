SUMMARY = "Haskell stm library documentation"
DESCRIPTION = "This package provides the Haskell stm library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.5.1.0"

RPM_NAME = "ghc-stm-doc-2.5.1.0-1.1.noarch.rpm"
RPM_HASH = "fb4a335111954b5e40c3bc912dc47ce5c2f4514172006396ca59a017229b3733617fe1f3cdbc6436a156c6b1b1c7e54d94cb6d29258a3d51f5884a0c15362d8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-stm-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
