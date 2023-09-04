SUMMARY = "Haskell config-ini library documentation"
DESCRIPTION = "This package provides the Haskell config-ini library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.6.0"

RPM_NAME = "ghc-config-ini-doc-0.2.6.0-1.5.noarch.rpm"
RPM_HASH = "13f10064b845c47bcff56f79764f30a0a3581523e626600cbabe0940852b33b215e7c63d1db5c9862a2248679fd17ba131d6651d6b0f1066b332b0717e392e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-config-ini-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
