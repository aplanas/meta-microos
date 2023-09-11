SUMMARY = "Haskell setlocale library documentation"
DESCRIPTION = "This package provides the Haskell setlocale library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-doc-1.0.0.10-5.1.noarch.rpm"
RPM_HASH = "5355df29254d44ca1dad89ef32536357fe3e7a3f6f997a913fab2cebee968d6fb1bd32c731e93f63bc19643a381835ac56552bb914ae7d6cecceeed2aefac4cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-setlocale-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
