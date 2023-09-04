SUMMARY = "Haskell syb library documentation"
DESCRIPTION = "This package provides the Haskell syb library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.2.4"

RPM_NAME = "ghc-syb-doc-0.7.2.4-1.3.noarch.rpm"
RPM_HASH = "a0daa871a8de0662c69249b6bb7109d7c81c102ba86ce01503e0a3df5222db5c0b5f81a7f15a9fe39d59e8fdd935bd2ffc7c04f48c7a44e3eb054b0640f4abe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-syb-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
