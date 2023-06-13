SUMMARY = "Haskell distributive library documentation"
DESCRIPTION = "This package provides the Haskell distributive library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.6.2.1"

RPM_NAME = "ghc-distributive-doc-0.6.2.1-3.2.noarch.rpm"
RPM_HASH = "b732d3c759d808069b8d6d361e0dc959fa098b954a95d617ed3e06d6e12558e41d5ba8963f5d0837623743a9e47c1d6cc82cd7521265cb6db15e95104d8a6c44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-distributive-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
