SUMMARY = "Haskell wai-app-static library documentation"
DESCRIPTION = "This package provides the Haskell wai-app-static library documentation."
LICENSE = "MIT"

PV = "3.1.7.4"

RPM_NAME = "ghc-wai-app-static-doc-3.1.7.4-2.7.noarch.rpm"
RPM_HASH = "86c96a492e915d35903f9947b9bb52247a008c4ef7ba5a3aab39ee84ece6a4ae3138bf2a5dadef895f4151ccbdb8f08ce927f091ed9d4ee26e6ad6030933a9b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-app-static-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
