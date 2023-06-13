SUMMARY = "Haskell text-short library documentation"
DESCRIPTION = "This package provides the Haskell text-short library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-text-short-doc-0.1.5-3.3.noarch.rpm"
RPM_HASH = "5d99c386fe50f3bc305a137ca05a1f77a7d54c40fb50d809d84ba914334d0609156364342b4f51ea14174d6eadffa0dd2ae3b541dcba77bd21984965758f3a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-short-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
