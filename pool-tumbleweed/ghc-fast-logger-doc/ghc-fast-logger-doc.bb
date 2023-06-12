SUMMARY = "Haskell fast-logger library documentation"
DESCRIPTION = "This package provides the Haskell fast-logger library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "ghc-fast-logger-doc-3.1.2-1.3.noarch.rpm"
RPM_HASH = "bf3bac5262225fad5e94ecb45e0dd003fc63b9a74d123773199a9450d8d193f9a89dc30bac9aaf3f53bc3faed7ceedd6c29b7a6a80326ac12eb87b8a83572e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fast-logger-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
