SUMMARY = "Haskell dense-linear-algebra library documentation"
DESCRIPTION = "This package provides the Haskell dense-linear-algebra library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-dense-linear-algebra-doc-0.1.0.0-3.9.noarch.rpm"
RPM_HASH = "3983d01290d5c05750d865be40905e186082122e94f3a9c5b3a56b0096cfdfbd5ef59f72b3afd421d853e90b6ef13272761847bd0b6e63c021cb64fe553e7a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-dense-linear-algebra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
