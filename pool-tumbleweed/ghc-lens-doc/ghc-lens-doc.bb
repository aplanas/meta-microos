SUMMARY = "Haskell lens library documentation"
DESCRIPTION = "This package provides the Haskell lens library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.2.2"

RPM_NAME = "ghc-lens-doc-5.2.2-2.1.noarch.rpm"
RPM_HASH = "e64fa1631d0a094a6dd105000b8a0b26a4867670ed25f52012b83c493d42c4c86c956763a29036a5e2ddf23d9bb730040a22eb78eb065389d8e4f7adf72ee9a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lens-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
