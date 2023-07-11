SUMMARY = "Haskell isocline library documentation"
DESCRIPTION = "This package provides the Haskell isocline library documentation."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "ghc-isocline-doc-1.0.9-1.6.noarch.rpm"
RPM_HASH = "8a3fc86ab066acf5524141159a67dce67151eefced3d9754ca44d835067ac12f6148420a98f2a6c37fcaec3415f0529b479e2e09565538e5f913ec7e9e10f4a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-isocline-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
