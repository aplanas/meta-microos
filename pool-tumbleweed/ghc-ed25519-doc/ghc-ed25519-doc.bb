SUMMARY = "Haskell ed25519 library documentation"
DESCRIPTION = "This package provides the Haskell ed25519 library documentation."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-doc-0.0.5.0-16.2.noarch.rpm"
RPM_HASH = "97fd04be767cfd559da7cee06b8efa408c4be2c78ad153771832a7a0188e55d08c783f46d99289e97ce1b6011444798da31c2a42b4417f80671af73e9912fe65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ed25519-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
