SUMMARY = "Haskell deepseq library documentation"
DESCRIPTION = "This package provides the Haskell deepseq library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.8.0"

RPM_NAME = "ghc-deepseq-doc-1.4.8.0-3.1.noarch.rpm"
RPM_HASH = "4eeb675ee750897d10f10e43df117f27d0553b448c8fa22cbb2f1e2fb56edb23ed92be24aebc3af7099c91a103fedd7ba031942d3fa64629f387720dda7b07fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-deepseq-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
