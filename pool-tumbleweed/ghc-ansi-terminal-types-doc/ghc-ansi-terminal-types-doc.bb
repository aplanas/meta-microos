SUMMARY = "Haskell ansi-terminal-types library documentation"
DESCRIPTION = "This package provides the Haskell ansi-terminal-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.5"

RPM_NAME = "ghc-ansi-terminal-types-doc-0.11.5-1.2.noarch.rpm"
RPM_HASH = "413687a42f9096624acc018ba64da1007025a927372fe2f100eff83c9646f690fcdfb1e599bea5d3bf1f3f51b09db694164dd3f5a12a2b534ccf19849b523e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ansi-terminal-types-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
