SUMMARY = "Haskell ghci library documentation"
DESCRIPTION = "This package provides the Haskell ghci library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghci-doc-9.4.5-1.1.noarch.rpm"
RPM_HASH = "be3677594faedadeb08f8a8dfe7a6e66405b43f102c8b4a9ae69cb163b69339ee319d27f7f9b2d96304e9448ecabe47df540b68bd47ace9d981586a6f282ade3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghci-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
