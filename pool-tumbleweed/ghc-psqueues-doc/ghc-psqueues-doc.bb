SUMMARY = "Haskell psqueues library documentation"
DESCRIPTION = "This package provides the Haskell psqueues library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.7.3"

RPM_NAME = "ghc-psqueues-doc-0.2.7.3-2.6.noarch.rpm"
RPM_HASH = "37bfbb2afe54ecafe9f3fbf47dbd2e7caca2930902fcf64b0eea8176bf6dc884bf531606efe8c76904341650caaafa0eff58a9d357e59d276b996d025d4648b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-psqueues-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
