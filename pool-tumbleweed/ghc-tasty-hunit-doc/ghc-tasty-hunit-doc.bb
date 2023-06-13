SUMMARY = "Haskell tasty-hunit library documentation"
DESCRIPTION = "This package provides the Haskell tasty-hunit library documentation."
LICENSE = "MIT"

PV = "0.10.0.3"

RPM_NAME = "ghc-tasty-hunit-doc-0.10.0.3-2.2.noarch.rpm"
RPM_HASH = "a208d5203fcc0d9aa993ae35cdfa71ff466f9af21ac0a1346399154c39e995efd5c50dd18c212c6f591a47543edffd006ec5aa0cfc57c5831d1883c831e9910f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-hunit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
