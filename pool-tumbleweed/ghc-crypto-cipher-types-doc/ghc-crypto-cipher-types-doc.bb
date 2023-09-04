SUMMARY = "Haskell crypto-cipher-types library documentation"
DESCRIPTION = "This package provides the Haskell crypto-cipher-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-cipher-types-doc-0.0.9-4.8.noarch.rpm"
RPM_HASH = "b4ab8996faf94def8ad19f10f1729dd7117dbc3f6b8099746866353841f54ddcb84e369ed349d82d061595554518572fda7fc9e1ba3145adfa1f9387968dd4b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypto-cipher-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
