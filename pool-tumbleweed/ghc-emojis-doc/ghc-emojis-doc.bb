SUMMARY = "Haskell emojis library documentation"
DESCRIPTION = "This package provides the Haskell emojis library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-emojis-doc-0.1.2-2.2.noarch.rpm"
RPM_HASH = "7ba85313ed1315d16bd03ed5d3d77633d7ff3286ee4aebc7856d30f3b437903d8850a320dc4e86ddbd152442f4bb385298bfd91588817710cc75f685c540d2d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-emojis-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
