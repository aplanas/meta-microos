SUMMARY = "Haskell wai-app-static library documentation"
DESCRIPTION = "This package provides the Haskell wai-app-static library documentation."
LICENSE = "MIT"

PV = "3.1.7.4"

RPM_NAME = "ghc-wai-app-static-doc-3.1.7.4-2.4.noarch.rpm"
RPM_HASH = "f97104a8a0af513e01d7266b893c63448fb51191cd90e05946a49fe8210bcca4a28b4e7194f96031ee1a995aaf15d27b6b3400fdc822510e375b6e1c46947a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-app-static-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
