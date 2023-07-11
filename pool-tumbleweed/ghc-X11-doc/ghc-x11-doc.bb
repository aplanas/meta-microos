SUMMARY = "Haskell X11 library documentation"
DESCRIPTION = "This package provides the Haskell X11 library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.10.3"

RPM_NAME = "ghc-X11-doc-1.10.3-2.6.noarch.rpm"
RPM_HASH = "fcfa10baf2c41aa242d3d4b9b7bc27c4428ffb4e963945474a8a1020243595d2e919c8f5447705af904195a5f99385ad9e18a2b7a5468003380fcfcc89f18891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-X11-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
