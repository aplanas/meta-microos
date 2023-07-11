SUMMARY = "Haskell haddock-library library documentation"
DESCRIPTION = "This package provides the Haskell haddock-library library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.11.0"

RPM_NAME = "ghc-haddock-library-doc-1.11.0-2.6.noarch.rpm"
RPM_HASH = "8596ea1ccfa2d200a0182783dd54e0754e95f29b479fa0f94fb372f63139b73cde2022cc0fef5b1df36db131ebc25ed5979d4ff44f32144cf073899a66146fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-haddock-library-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
