SUMMARY = "Haskell warp library documentation"
DESCRIPTION = "This package provides the Haskell warp library documentation."
LICENSE = "MIT"

PV = "3.3.25"

RPM_NAME = "ghc-warp-doc-3.3.25-1.4.noarch.rpm"
RPM_HASH = "32b1eb9c5ead6a4c7dd09f709a58d9fd3fb6800617d8942752768f26ed8edb5c00202a42374785f76bb7d9633428feb2bd4b4ee1c29d42be4587fc4618fb2f52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-warp-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
