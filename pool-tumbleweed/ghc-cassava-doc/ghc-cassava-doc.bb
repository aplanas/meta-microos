SUMMARY = "Haskell cassava library documentation"
DESCRIPTION = "This package provides the Haskell cassava library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.3.0"

RPM_NAME = "ghc-cassava-doc-0.5.3.0-2.3.noarch.rpm"
RPM_HASH = "6c894dd292730e23c9a2ffe2af22b2cd1cf293ec8f75e8d416f70654b22d359e537356c31249789b00d74c5fa7912c53d9ca4976589eb4ffd2370cb4a49b0476"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cassava-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
