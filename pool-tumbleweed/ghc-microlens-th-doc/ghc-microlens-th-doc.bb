SUMMARY = "Haskell microlens-th library documentation"
DESCRIPTION = "This package provides the Haskell microlens-th library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.13"

RPM_NAME = "ghc-microlens-th-doc-0.4.3.13-1.1.noarch.rpm"
RPM_HASH = "634d7545c0c4bb4a671327a2ddf49c544c1246f385f237a7c1559e4ed3d8d23ec07ac93d3209ba0cfcc452c1544b8fa0fba552db19a3622c1344e02fc05723af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-th-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
