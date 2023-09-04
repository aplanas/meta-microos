SUMMARY = "Haskell ghc-compact library documentation"
DESCRIPTION = "This package provides the Haskell ghc-compact library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-doc-0.1.0.0-1.1.noarch.rpm"
RPM_HASH = "98bb20ca4dc589ff96e4b9b674ed810d2a45837da86efe364d9e08e6e7a092aa05beaad5d124114153aed37120fc0bc33d259a093552fb666d43df83cbc909d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-compact-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
