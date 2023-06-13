SUMMARY = "Haskell megaparsec library documentation"
DESCRIPTION = "This package provides the Haskell megaparsec library documentation."
LICENSE = "BSD-2-Clause"

PV = "9.3.0"

RPM_NAME = "ghc-megaparsec-doc-9.3.0-1.3.noarch.rpm"
RPM_HASH = "738d57eb47433c805bd1d34459a03f4b0683302a06f00a3f57722989b6ef0147fbae9c7da6ecb5535b462a8c6b58593683949ce46822c5c77398a35138501e47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-megaparsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
