SUMMARY = "Haskell wai-logger library documentation"
DESCRIPTION = "This package provides the Haskell wai-logger library documentation."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ghc-wai-logger-doc-2.4.0-2.5.noarch.rpm"
RPM_HASH = "48ab9bcb6beb7cd3fe4af6660adb4450915c14027eedd0f14792f10d53d2e8042cf5c438da868a2f3fc6d35551aa10a4e4ab69f6274eaeea40a5756fe85d06ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-logger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
