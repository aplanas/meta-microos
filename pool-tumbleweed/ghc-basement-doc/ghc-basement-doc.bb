SUMMARY = "Haskell basement library documentation"
DESCRIPTION = "This package provides the Haskell basement library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-basement-doc-0.0.16-1.5.noarch.rpm"
RPM_HASH = "c717ac87278da9284350f38d3c8d347ecc40c59d37644de7b7678f99c04b331a9859be03c312ffe055238781b8b07ad2d5cb953a8e3be45d64c9f5f4e17383aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-basement-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
