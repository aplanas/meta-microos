SUMMARY = "Haskell unix library documentation"
DESCRIPTION = "This package provides the Haskell unix library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-doc-2.7.3-3.1.noarch.rpm"
RPM_HASH = "f5ebcdbf8692f0c8f07fac49d8ee6bb5a259f2bf8116c4c85c1ca92fa5ba05c91e21b0ecbb0bdbfded8ba7856838f784d32e4998612e0189c3bcb0a19b3693f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
