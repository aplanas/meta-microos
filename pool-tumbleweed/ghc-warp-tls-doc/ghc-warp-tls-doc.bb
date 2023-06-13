SUMMARY = "Haskell warp-tls library documentation"
DESCRIPTION = "This package provides the Haskell warp-tls library documentation."
LICENSE = "MIT"

PV = "3.3.6"

RPM_NAME = "ghc-warp-tls-doc-3.3.6-1.4.noarch.rpm"
RPM_HASH = "7064d9e177b58494ce9b2bd7797a5be5e6c491d9721867f621b50c98bec7c44afd8c45cb9d63e89933aa25fe7ce0a74a4ffac79a3701c8b61900a096359bdf47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-warp-tls-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
