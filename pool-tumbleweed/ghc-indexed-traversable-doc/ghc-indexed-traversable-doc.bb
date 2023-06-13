SUMMARY = "Haskell indexed-traversable library documentation"
DESCRIPTION = "This package provides the Haskell indexed-traversable library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.2.1"

RPM_NAME = "ghc-indexed-traversable-doc-0.1.2.1-1.2.noarch.rpm"
RPM_HASH = "d27dc9940334c717e529b4e5a7040f5ea1422834175b5af70cddeb9f5d6accb634cd51772bf17519b48c0804711e7ed45c63afbee0039e8f6203c14507d04990"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-indexed-traversable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
