SUMMARY = "Haskell binary library documentation"
DESCRIPTION = "This package provides the Haskell binary library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-doc-0.8.9.1-1.1.noarch.rpm"
RPM_HASH = "cd89a9a6a3f8ed9f72aaad30c9349b39036e8fc537b2a835af4d2abc02df94218d2b45116b29d6b0fe07499e47be54d73f43121d3c2def5080cc054d8c40fd50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-binary-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
