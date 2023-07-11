SUMMARY = "Haskell directory library documentation"
DESCRIPTION = "This package provides the Haskell directory library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1"

RPM_NAME = "ghc-directory-doc-1.3.7.1-3.2.noarch.rpm"
RPM_HASH = "9c321127ad9a9da0701fbf415f93b9a303b438044c5d3cd63b5675e9828b87fe283c1f18cfe28b8f74cc8e80ca8fa3566c92b698a0a53a1f7e45ff816c9556ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-directory-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
