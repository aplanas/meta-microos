SUMMARY = "Haskell crypto-cipher-types library documentation"
DESCRIPTION = "This package provides the Haskell crypto-cipher-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-cipher-types-doc-0.0.9-4.6.noarch.rpm"
RPM_HASH = "0f4913a8f8f1729819b2073bb9be1c09a8c9729d2c7abcc5a4b328c6bca0e0a466ad6a8a47e81fc10dde8f62a08dc839d5b42ddc0b20ec343ffb5bbe1090e1ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypto-cipher-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
