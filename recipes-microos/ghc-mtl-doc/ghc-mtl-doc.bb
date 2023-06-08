SUMMARY = "Haskell mtl library documentation"
DESCRIPTION = "This package provides the Haskell mtl library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-doc-2.2.2-1.1.noarch.rpm"
RPM_HASH = "63f64c5d1ef21db26df37f52203266ce429bead2562a3d5a530b47d32e919723a01deec6306b3a3db7c1f1255ae67a093c05a2d52f9ffe20d0c37452cbd96c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mtl-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
