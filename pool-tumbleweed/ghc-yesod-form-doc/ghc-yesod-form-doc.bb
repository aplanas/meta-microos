SUMMARY = "Haskell yesod-form library documentation"
DESCRIPTION = "This package provides the Haskell yesod-form library documentation."
LICENSE = "MIT"

PV = "1.7.4"

RPM_NAME = "ghc-yesod-form-doc-1.7.4-1.7.noarch.rpm"
RPM_HASH = "4e8117a0c298081f9a7dc4a1c782c22051263aadf7c6a492398fd4230a1826cf351ef2392f25ab9d59f29b834d2321a48a2aa1635fc8f527fc530e1537bae022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-form-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
