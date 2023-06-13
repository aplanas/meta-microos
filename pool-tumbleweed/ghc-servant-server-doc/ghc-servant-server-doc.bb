SUMMARY = "Haskell servant-server library documentation"
DESCRIPTION = "This package provides the Haskell servant-server library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "ghc-servant-server-doc-0.19.2-2.4.noarch.rpm"
RPM_HASH = "e57d86e955266211e4e22bcf5635552a324ce79d2bf390de8f16055dea9bae4b60e39f516b65fc2b7f8fbe5a30600a138315398b09da8fd11c8f1f9f76993d76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-servant-server-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
