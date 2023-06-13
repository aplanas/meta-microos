SUMMARY = "Haskell semigroupoids library documentation"
DESCRIPTION = "This package provides the Haskell semigroupoids library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.3.7"

RPM_NAME = "ghc-semigroupoids-doc-5.3.7-2.3.noarch.rpm"
RPM_HASH = "b0ea9b2bdafaa6ae76e23b71c9a825870e11e46120a496189d2608ff7c16126a909e669107d673a01b97ebeaa43f7e9accda9eea7e564852121b0476e228919f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semigroupoids-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
