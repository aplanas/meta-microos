SUMMARY = "Haskell typst-symbols library documentation"
DESCRIPTION = "This package provides the Haskell typst-symbols library documentation."
LICENSE = "MIT"

PV = "0.1.0.1"

RPM_NAME = "ghc-typst-symbols-doc-0.1.0.1-1.3.noarch.rpm"
RPM_HASH = "d8c8383ec1469220bf626953db40a670cf32fc5a4a7e2800140f661b7ddc10cbbc76bf6a393a4c37518f7b475de101a1d02b77e290d231f09e5174588de9f7b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-typst-symbols-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
