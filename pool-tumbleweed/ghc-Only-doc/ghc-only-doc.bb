SUMMARY = "Haskell Only library documentation"
DESCRIPTION = "This package provides the Haskell Only library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-Only-doc-0.1-5.2.noarch.rpm"
RPM_HASH = "155efcc652f750d5917232de9a4f8e14ff618016131ca2f13e8cb448197ceade75c910a791e6284e18e7f008bbff07c000ddc6cd46da23a31679f6e16e42a9b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Only-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
