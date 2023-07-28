SUMMARY = "Haskell yesod-form library documentation"
DESCRIPTION = "This package provides the Haskell yesod-form library documentation."
LICENSE = "MIT"

PV = "1.7.4"

RPM_NAME = "ghc-yesod-form-doc-1.7.4-1.11.noarch.rpm"
RPM_HASH = "0a378e03ef3ad284e8ec72fd68310596bfec90f39a5ef7376f37beaa9d8bd43b848a0c3617ea8612005f0899e781970c8d727c3b71fc81d46543b6690f50d4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-form-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
