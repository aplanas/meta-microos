SUMMARY = "Haskell mwc-random library documentation"
DESCRIPTION = "This package provides the Haskell mwc-random library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.15.0.2"

RPM_NAME = "ghc-mwc-random-doc-0.15.0.2-3.6.noarch.rpm"
RPM_HASH = "b98a8469797f1f72b03a574ab11da5f9928f9eed8d470a938345b9d408b34fddf2a9ef53cbd9b6cd6b204fbd10800ae6ec9ff496a998b4fb8948633321c34c79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mwc-random-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
