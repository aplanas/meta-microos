SUMMARY = "Haskell regex-base library documentation"
DESCRIPTION = "This package provides the Haskell regex-base library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.2"

RPM_NAME = "ghc-regex-base-doc-0.94.0.2-4.1.noarch.rpm"
RPM_HASH = "58d9cd3b163ef6ed2d9476efa233778815278f2666bbfd7e09a63241ce8d42e5b67f0a424b781bc9314fc0ad44a20a9be902e3717c5757c9242f93097f0d9b1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-base-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
