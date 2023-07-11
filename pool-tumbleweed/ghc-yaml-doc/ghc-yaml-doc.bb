SUMMARY = "Haskell yaml library documentation"
DESCRIPTION = "This package provides the Haskell yaml library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.11.1"

RPM_NAME = "ghc-yaml-doc-0.11.11.1-1.2.noarch.rpm"
RPM_HASH = "1b7ad2aee7f6915b8978d32b729a286b079994a08e49230071b1756993d0bbe574531a1b2b3ccb26cb30d91b57b52e88afd42af0bbe59c341cb9cbdbd3c8c2c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yaml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
