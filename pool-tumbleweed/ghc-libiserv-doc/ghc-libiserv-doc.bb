SUMMARY = "Haskell libiserv library documentation"
DESCRIPTION = "This package provides the Haskell libiserv library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-libiserv-doc-9.4.6-1.1.noarch.rpm"
RPM_HASH = "15106d44e9f944d35fb0117d0d4ba92a915ebab06ab4de770f56dbbbdfe248b7845ef034932ec4b252760892c4a2ab8338255ec54dcc68a17e36dc5a76066e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-libiserv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
