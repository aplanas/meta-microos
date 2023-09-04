SUMMARY = "Haskell hashable library documentation"
DESCRIPTION = "This package provides the Haskell hashable library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.3.0"

RPM_NAME = "ghc-hashable-doc-1.4.3.0-1.3.noarch.rpm"
RPM_HASH = "f9bd790413e62fbc6e07de399667a8e138a9f4355543dd3dff12782693347e5116e8e2635977e2e92772ce50d217a7e2b4e59c38136debac27e33d0d87c37125"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hashable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
