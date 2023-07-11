SUMMARY = "Haskell timezone-olson library documentation"
DESCRIPTION = "This package provides the Haskell timezone-olson library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-timezone-olson-doc-0.2.1-2.6.noarch.rpm"
RPM_HASH = "d0d7d20ad15f2f742f9f4a91d845df438fc87b9df531db5de4cd0abd35b4749a3f59fcdddc96823a938b2f73c2a2afafcae3aa093755b4027f306bb9a60f21ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-timezone-olson-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
