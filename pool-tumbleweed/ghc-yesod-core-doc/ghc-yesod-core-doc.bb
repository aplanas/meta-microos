SUMMARY = "Haskell yesod-core library documentation"
DESCRIPTION = "This package provides the Haskell yesod-core library documentation."
LICENSE = "MIT"

PV = "1.6.24.4"

RPM_NAME = "ghc-yesod-core-doc-1.6.24.4-1.6.noarch.rpm"
RPM_HASH = "a0e1a724ab230a97fb905d8bdea397875d0e246ba2968e6c92a263a22d12e38cc6c31719e3f7c51d41ffab0aa45d8066849d236b9e18546513d036f0b34a6c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
