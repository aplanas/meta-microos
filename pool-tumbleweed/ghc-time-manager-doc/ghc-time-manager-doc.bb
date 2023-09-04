SUMMARY = "Haskell time-manager library documentation"
DESCRIPTION = "This package provides the Haskell time-manager library documentation."
LICENSE = "MIT"

PV = "0.0.1"

RPM_NAME = "ghc-time-manager-doc-0.0.1-1.1.noarch.rpm"
RPM_HASH = "73f8292ee17429ac44459ccb1ac3c2957414cf9ff186b4f854d5938ff8b9d2403de32599d14a08c6ad09c68a975822241da3c2f55182580e41c831231542ea47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-manager-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
