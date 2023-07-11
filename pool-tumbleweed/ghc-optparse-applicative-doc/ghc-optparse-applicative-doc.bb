SUMMARY = "Haskell optparse-applicative library documentation"
DESCRIPTION = "This package provides the Haskell optparse-applicative library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.18.1.0"

RPM_NAME = "ghc-optparse-applicative-doc-0.18.1.0-1.3.noarch.rpm"
RPM_HASH = "b37a09d6e17f271822f73785d1a4aa9f5c5339b0b65ee0d0c451fcd270dd9d0640990103a26a15ccc8ba4a8b3861a7b843cace4ee2584f7774a20dae030b3116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-optparse-applicative-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
