SUMMARY = "Haskell parsec library documentation"
DESCRIPTION = "This package provides the Haskell parsec library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.16.1"

RPM_NAME = "ghc-parsec-doc-3.1.16.1-3.2.noarch.rpm"
RPM_HASH = "39e930ffa14e088252b47c58063094e0c72ddb3a1d7dd2e1562d8b029a5e1c42d735ccf07489507653064d67c0f5e3c734947b0b6028cb22c4f03b3fc0ad388f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
