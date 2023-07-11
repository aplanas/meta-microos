SUMMARY = "Haskell easy-file library documentation"
DESCRIPTION = "This package provides the Haskell easy-file library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "ghc-easy-file-doc-0.2.5-1.3.noarch.rpm"
RPM_HASH = "fb5b3b6eb07f8d2e1839aa89752ac0ba1a8fc59906242abcf27d48776adf1829a7c3590e2066c58723394a67684ad9cffc93e40968406caff2fb84c957694147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-easy-file-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
