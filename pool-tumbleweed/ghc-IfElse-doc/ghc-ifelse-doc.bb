SUMMARY = "Haskell IfElse library documentation"
DESCRIPTION = "This package provides the Haskell IfElse library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.85"

RPM_NAME = "ghc-IfElse-doc-0.85-4.3.noarch.rpm"
RPM_HASH = "7f7c3fbdabccb82167d5c95c1911766a04fa1b6e7e7e708c73cafd82170d1330dca808e621d53dd234c9d14aaa6f67949d1dbb6c72ad915769da7b9bd0ad4521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-IfElse-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
