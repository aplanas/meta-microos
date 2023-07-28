SUMMARY = "Haskell clientsession library documentation"
DESCRIPTION = "This package provides the Haskell clientsession library documentation."
LICENSE = "MIT"

PV = "0.9.2.0"

RPM_NAME = "ghc-clientsession-doc-0.9.2.0-1.1.noarch.rpm"
RPM_HASH = "c79677d9272964f3ce472f91fe30f03e08ce723c18f603879cbf55e3507cc574e9ed85124b383f032b375e9d1f7bb828c9374ecaea8a733c78e926eb370f1edb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-clientsession-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
