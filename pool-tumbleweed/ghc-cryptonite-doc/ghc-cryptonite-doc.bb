SUMMARY = "Haskell cryptonite library documentation"
DESCRIPTION = "This package provides the Haskell cryptonite library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.30"

RPM_NAME = "ghc-cryptonite-doc-0.30-2.6.noarch.rpm"
RPM_HASH = "71e7643b1625f6885a9b8c14abf94d377ccbd91af54c7dd7ca112c43bb98f82446fb35cf384bccc28903de56c95b2cc2a79b6904a6cea5779c5c646ed231266b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptonite-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
