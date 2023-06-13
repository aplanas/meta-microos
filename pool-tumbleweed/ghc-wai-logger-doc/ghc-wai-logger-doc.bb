SUMMARY = "Haskell wai-logger library documentation"
DESCRIPTION = "This package provides the Haskell wai-logger library documentation."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ghc-wai-logger-doc-2.4.0-2.3.noarch.rpm"
RPM_HASH = "06bfc4a90d5fa55e3af4c83c85d12433966c0b903aed57f5b1a53ce7c89c76e4bf6aceb2aabe402237199e30f029654119c7828d1965f05c612463dfef30fe3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-logger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
