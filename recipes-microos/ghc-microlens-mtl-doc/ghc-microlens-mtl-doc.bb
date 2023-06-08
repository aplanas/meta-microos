SUMMARY = "Haskell microlens-mtl library documentation"
DESCRIPTION = "This package provides the Haskell microlens-mtl library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.0.3"

RPM_NAME = "ghc-microlens-mtl-doc-0.2.0.3-2.2.noarch.rpm"
RPM_HASH = "1cf3a9ca630ee52a0f9275c83cb4595b5df92561db3d283625a112e61e332809469693aec0e3fcad9a12280d65f5e8a5f0ef8c60950c28483f00b6965fe83066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-mtl-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
