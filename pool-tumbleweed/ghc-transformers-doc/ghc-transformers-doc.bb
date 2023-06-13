SUMMARY = "Haskell transformers library documentation"
DESCRIPTION = "This package provides the Haskell transformers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-doc-0.5.6.2-3.1.noarch.rpm"
RPM_HASH = "3618211d64d89f48ce02818c1f696539d5bf41f76523c87aa9da006186db73e6d42778d4da56ce2d66904140e13e041cc484a90b4b5a0d944600459fe472a735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-transformers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
