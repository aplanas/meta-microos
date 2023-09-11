SUMMARY = "Haskell yesod-form library documentation"
DESCRIPTION = "This package provides the Haskell yesod-form library documentation."
LICENSE = "MIT"

PV = "1.7.4"

RPM_NAME = "ghc-yesod-form-doc-1.7.4-1.18.noarch.rpm"
RPM_HASH = "5443961088b80d5594d13ac1dc5302be49080365dad855b549363ba15317ad4cf6e24fabcba49503ab266bca11a4d245cad369297d131a0b16f2ba903aea0254"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yesod-form-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
