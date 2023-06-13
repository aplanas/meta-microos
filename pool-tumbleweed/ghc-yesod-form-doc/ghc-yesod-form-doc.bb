SUMMARY = "Haskell yesod-form library documentation"
DESCRIPTION = "This package provides the Haskell yesod-form library documentation."
LICENSE = "MIT"

PV = "1.7.4"

RPM_NAME = "ghc-yesod-form-doc-1.7.4-1.4.noarch.rpm"
RPM_HASH = "935a341fae6a3bf3ced78dca3a59327a99a412a721b55e728e50ab64170168c53147be939775657015e81cf00c1971d38a7002206a592df1b69310598f193825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-form-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
