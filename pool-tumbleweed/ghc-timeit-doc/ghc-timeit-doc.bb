SUMMARY = "Haskell timeit library documentation"
DESCRIPTION = "This package provides the Haskell timeit library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "ghc-timeit-doc-2.0-6.3.noarch.rpm"
RPM_HASH = "cb3aa9da55a2203eb45c23ad192431cf43611dfb20dd6e455468e3efac65c6a0bc37f1ea824c088eefd58ba8903f2829b327dfc3088309f8e8f4e5bf78aabb59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-timeit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
