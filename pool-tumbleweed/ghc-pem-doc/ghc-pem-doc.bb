SUMMARY = "Haskell pem library documentation"
DESCRIPTION = "This package provides the Haskell pem library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-doc-0.2.4-8.6.noarch.rpm"
RPM_HASH = "6d08d559f3fb5e5a14e77b4f213d7ddeea29a98e7100032141c70eee868118183bc820a7fcb898f1e37d029e1727fb84f02ba80a5fe6279a61350b83d2a1e27f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pem-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
