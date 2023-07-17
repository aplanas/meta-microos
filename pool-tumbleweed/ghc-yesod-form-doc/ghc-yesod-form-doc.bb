SUMMARY = "Haskell yesod-form library documentation"
DESCRIPTION = "This package provides the Haskell yesod-form library documentation."
LICENSE = "MIT"

PV = "1.7.4"

RPM_NAME = "ghc-yesod-form-doc-1.7.4-1.9.noarch.rpm"
RPM_HASH = "aada59577f176ea55d5981e731f817b26fd57161276eff13dda8702f5c94e0edbe97b89d69e0b48bba4ae6c34127eb50f76f835dd86b2544e9aa26e96b4a25c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-form-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
