SUMMARY = "Haskell monad-control library documentation"
DESCRIPTION = "This package provides the Haskell monad-control library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.3.1"

RPM_NAME = "ghc-monad-control-doc-1.0.3.1-2.3.noarch.rpm"
RPM_HASH = "bb088eed129a7167e21148f2756703b5e908aaa82ee6755a1bdaf9dc92f97e5513b6bf298ba6ccbfeea37f70eaa3bf929dcdc07e0f95f86349eef91b438fde8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monad-control-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
