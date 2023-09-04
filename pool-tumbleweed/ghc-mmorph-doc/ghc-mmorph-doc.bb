SUMMARY = "Haskell mmorph library documentation"
DESCRIPTION = "This package provides the Haskell mmorph library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "ghc-mmorph-doc-1.2.0-4.3.noarch.rpm"
RPM_HASH = "4bab630fbc18a77b8f2af43be7a41acba21b3315923598c8a21c4039c73013d640e3d599bae180b4da261e81979cd833a1e617503cc830541ec90c0348eca497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mmorph-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
