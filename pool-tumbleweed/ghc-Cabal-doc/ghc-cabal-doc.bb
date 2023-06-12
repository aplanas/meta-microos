SUMMARY = "Haskell Cabal library documentation"
DESCRIPTION = "This package provides the Haskell Cabal library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-doc-3.8.1.0-3.1.noarch.rpm"
RPM_HASH = "bb791b968c5fae77919bb1817e7be45eab71776083924c8c5cf60a8663aabdc44bb8e17d16235fb2cdf8be161ced55b3f11c4a478e5aaef6ba5a6fc12ee655bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Cabal-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
