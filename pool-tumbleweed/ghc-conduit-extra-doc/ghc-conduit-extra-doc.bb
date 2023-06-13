SUMMARY = "Haskell conduit-extra library documentation"
DESCRIPTION = "This package provides the Haskell conduit-extra library documentation."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "ghc-conduit-extra-doc-1.3.6-2.5.noarch.rpm"
RPM_HASH = "76051bf3e3d129c49627e2b6a4121966fc9c6e471e69e99a8c1d8c625e4295fbb4dab217bdefdbaa26b7a2e6d4094a9050d93a364cb9482f8d015350fccf995d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-conduit-extra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
