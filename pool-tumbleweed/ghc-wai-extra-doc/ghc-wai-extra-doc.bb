SUMMARY = "Haskell wai-extra library documentation"
DESCRIPTION = "This package provides the Haskell wai-extra library documentation."
LICENSE = "MIT"

PV = "3.1.13.0"

RPM_NAME = "ghc-wai-extra-doc-3.1.13.0-2.9.noarch.rpm"
RPM_HASH = "16c66f89a7a64de1893f3dd142afa919c9cf0959807ccc477e966f05eb14465c8c1e3d0a528769772d59e4a83abef6236d84e86016a9d8a9c0a6c3fbda4f0621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-extra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
