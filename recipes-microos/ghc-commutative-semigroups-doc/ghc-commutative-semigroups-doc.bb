SUMMARY = "Haskell commutative-semigroups library documentation"
DESCRIPTION = "This package provides the Haskell commutative-semigroups library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-commutative-semigroups-doc-0.1.0.1-1.2.noarch.rpm"
RPM_HASH = "f6b44452eb1bb2c5dfa7f8a8c796b535974ed3c8e9862df14448f18000b1e00734915cceb3e3814a1f2ab10c782062077018df26cc97d37bc0d1eab6acc90e22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-commutative-semigroups-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
