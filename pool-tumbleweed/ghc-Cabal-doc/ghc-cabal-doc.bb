SUMMARY = "Haskell Cabal library documentation"
DESCRIPTION = "This package provides the Haskell Cabal library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-doc-3.8.1.0-1.1.noarch.rpm"
RPM_HASH = "df591536b7430b36ad7295522ff8c70b1e4fc51a759210ad5e6821cf72ca12889763b053b9eae3c5358fe9feea009e8567b7e40fe93b7c01cb50ef0cddbb92a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Cabal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
