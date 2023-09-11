SUMMARY = "Haskell wai-app-static library documentation"
DESCRIPTION = "This package provides the Haskell wai-app-static library documentation."
LICENSE = "MIT"

PV = "3.1.7.4"

RPM_NAME = "ghc-wai-app-static-doc-3.1.7.4-2.13.noarch.rpm"
RPM_HASH = "3439078297b4803bf9b0be6a3e36a59d2fa3ede2eea688cc0937b39d40da9e38e614852031763642778431a607fc2a20d8cf9b96e280bf54ad83bea085d8c3ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-app-static-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
