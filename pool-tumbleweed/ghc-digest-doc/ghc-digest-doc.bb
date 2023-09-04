SUMMARY = "Haskell digest library documentation"
DESCRIPTION = "This package provides the Haskell digest library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.0.1.7"

RPM_NAME = "ghc-digest-doc-0.0.1.7-1.8.noarch.rpm"
RPM_HASH = "5ecd7e482d7622cec528db8d6e698ba2168c871c71fd1af60b202c69e7375f32d057fbd38aa36e6694a45dc033b5ce823fe1627cdf86f958e5413a65fee3bf46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-digest-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
