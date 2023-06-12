SUMMARY = "Haskell hpc library documentation"
DESCRIPTION = "This package provides the Haskell hpc library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.0"

RPM_NAME = "ghc-hpc-doc-0.6.1.0-3.1.noarch.rpm"
RPM_HASH = "641a7927f93b5baedd754e95dc2c43f74bc4fbd59ec6d11f111a1e0d7ac2f17f573dc37ed1fb8f1e88df0bf5ef1947e15f56966b93aa3231b2c6543f93066063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hpc-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
