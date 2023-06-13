SUMMARY = "Haskell indexed-traversable-instances library documentation"
DESCRIPTION = "This package provides the Haskell indexed-traversable-instances library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.1.2"

RPM_NAME = "ghc-indexed-traversable-instances-doc-0.1.1.2-1.2.noarch.rpm"
RPM_HASH = "2f8f195a892919756319143f6ae04f253bd9461e536df17bec7e12359673c145eb27a1481ce2e66022a75cd726374dad8427d75df91ec52e224ffa00d30d99d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-indexed-traversable-instances-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
