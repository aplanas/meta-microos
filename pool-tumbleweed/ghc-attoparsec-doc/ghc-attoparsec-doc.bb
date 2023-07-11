SUMMARY = "Haskell attoparsec library documentation"
DESCRIPTION = "This package provides the Haskell attoparsec library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "ghc-attoparsec-doc-0.14.4-3.6.noarch.rpm"
RPM_HASH = "8c49e739e2f2b4f60582d268483d88e020c9b9f976e0b2031a027244fd0460a3a3e6674b837fbc27af2f14c65db005e894db2b9e087a37a4fab8229b6a246b38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-attoparsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
