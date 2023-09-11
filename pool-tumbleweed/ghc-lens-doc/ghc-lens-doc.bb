SUMMARY = "Haskell lens library documentation"
DESCRIPTION = "This package provides the Haskell lens library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.2.3"

RPM_NAME = "ghc-lens-doc-5.2.3-1.1.noarch.rpm"
RPM_HASH = "ef1f0134b91552f41ba32b865e520ecbfe271cf9208a3b7a3530873dc518906055b348ae35242e73fdd50188589f65cafaf333864eb7cd8b6686c21bff5213ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lens-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
