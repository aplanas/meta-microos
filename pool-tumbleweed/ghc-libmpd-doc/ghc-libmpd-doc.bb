SUMMARY = "Haskell libmpd library documentation"
DESCRIPTION = "This package provides the Haskell libmpd library documentation."
LICENSE = "MIT"

PV = "0.10.0.0"

RPM_NAME = "ghc-libmpd-doc-0.10.0.0-2.3.noarch.rpm"
RPM_HASH = "4688e17f5d6bbf7b696a9ebce24814b7c101db8a7d742b144a453a5f3546a8b50997cee86b87a18a3ef464ff6d7023fc96e5c064abdc2ca1f75f735c8a196806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-libmpd-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
