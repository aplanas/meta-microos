SUMMARY = "Haskell aeson library documentation"
DESCRIPTION = "This package provides the Haskell aeson library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.1.2.1"

RPM_NAME = "ghc-aeson-doc-2.1.2.1-1.3.noarch.rpm"
RPM_HASH = "8eb053724c5c93e1e5a2f144bb4c1ac0ef653275d05b953df7aaee3b54ddf0171aad6041c77da84757e267a41e11325129af5c58e145067d5d6bdafecc8fad30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-aeson-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
