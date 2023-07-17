SUMMARY = "Haskell wai-app-static library documentation"
DESCRIPTION = "This package provides the Haskell wai-app-static library documentation."
LICENSE = "MIT"

PV = "3.1.7.4"

RPM_NAME = "ghc-wai-app-static-doc-3.1.7.4-2.8.noarch.rpm"
RPM_HASH = "289241c55a8078a41fd0b64a96d1608053fa33101a9a2341347eb1ff7a6920ae4627a9fc561af7f35904e13f4f24aaf0da1ccbc012aa1c512be32518ac978514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-app-static-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
