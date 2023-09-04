SUMMARY = "Haskell wai-logger library documentation"
DESCRIPTION = "This package provides the Haskell wai-logger library documentation."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ghc-wai-logger-doc-2.4.0-2.9.noarch.rpm"
RPM_HASH = "2e3e14b5175aeb55ff7933110fe5350ec94a640028d045e5f39d2e9169a3b4ba6b1fe8f8d28e9390bb4374b98399e4c8c886d0448014401434b4fc5d0a1d5072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-logger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
