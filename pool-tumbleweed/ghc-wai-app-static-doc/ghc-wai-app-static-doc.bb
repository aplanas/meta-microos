SUMMARY = "Haskell wai-app-static library documentation"
DESCRIPTION = "This package provides the Haskell wai-app-static library documentation."
LICENSE = "MIT"

PV = "3.1.7.4"

RPM_NAME = "ghc-wai-app-static-doc-3.1.7.4-2.12.noarch.rpm"
RPM_HASH = "f8b6530a4e6189005aa832bc6c5e790ab8ea3190353efc17abef21be9d0650ecfbcdd15a87d06c1dec66ba48dcfe0ed378388857a6e6ccfee37b02a352faf879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-app-static-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
