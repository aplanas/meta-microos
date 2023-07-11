SUMMARY = "Haskell parser-combinators library documentation"
DESCRIPTION = "This package provides the Haskell parser-combinators library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-parser-combinators-doc-1.3.0-2.6.noarch.rpm"
RPM_HASH = "f4ffd5964cfb2f8864d5e539a56526bf6d2e47096cd90bf0ed35ba68851bc15f4dfdbb3a72467e08c1d840672ad412afd414c4cf30b1650429a82c5223a00e22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parser-combinators-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
