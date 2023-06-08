SUMMARY = "Haskell ghc library documentation"
DESCRIPTION = "This package provides the Haskell ghc library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-doc-9.4.5-1.1.noarch.rpm"
RPM_HASH = "0638bd65d52f10ca394f06bce7c9079a181523739b82df3765d3cda047557afe98fd5965a22b54efc216a9d821976f2c23183196620f3f58e82d903a246f252e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
