SUMMARY = "Haskell type-equality library documentation"
DESCRIPTION = "This package provides the Haskell type-equality library documentation."
LICENSE = "BSD-3-Clause"

PV = "1"

RPM_NAME = "ghc-type-equality-doc-1-11.2.noarch.rpm"
RPM_HASH = "d8852e02708224b0d234aa20abf3d0bdce7acbf3ac4f465770e72f134d79aa6ded09b5bce11589673fda2dc6522e5882df34c8c0e9ed5f6fe83133b1fce5aed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-type-equality-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
