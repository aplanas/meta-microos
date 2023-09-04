SUMMARY = "Haskell contravariant library documentation"
DESCRIPTION = "This package provides the Haskell contravariant library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.5.5"

RPM_NAME = "ghc-contravariant-doc-1.5.5-2.8.noarch.rpm"
RPM_HASH = "662d31406d0aada43bed4606d021ae8d188ff1050285ba25e8ee08d623898c6d821564d224c5a0f6ab36d8efa50c20160a5fb41656ba10af4bca8cc9e139d41a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-contravariant-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
