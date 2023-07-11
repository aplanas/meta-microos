SUMMARY = "Haskell lukko library documentation"
DESCRIPTION = "This package provides the Haskell lukko library documentation."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "0.1.1.3"

RPM_NAME = "ghc-lukko-doc-0.1.1.3-5.6.noarch.rpm"
RPM_HASH = "7abe0a7d8f157007a224c2e8f1792b20de6913802dded11a3eb9d1ec24e4ec896f17c758999931fdf2b666835922dc8441697054e06e883e1c379207fb78619d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lukko-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
