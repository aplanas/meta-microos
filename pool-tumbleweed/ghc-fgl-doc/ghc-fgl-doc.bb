SUMMARY = "Haskell fgl library documentation"
DESCRIPTION = "This package provides the Haskell fgl library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.8.0.0"

RPM_NAME = "ghc-fgl-doc-5.8.0.0-3.2.noarch.rpm"
RPM_HASH = "c36a90dfd239d32976864ec85e838e9abaceda3c27ebf60d0c8e277772d107859fbe212efe69aaf3ec1fdb6d9d87bf433c5c05e3f56e8b945964c833af402e49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fgl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
