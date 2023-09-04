SUMMARY = "Haskell hslua-aeson library documentation"
DESCRIPTION = "This package provides the Haskell hslua-aeson library documentation."
LICENSE = "MIT"

PV = "2.3.0.1"

RPM_NAME = "ghc-hslua-aeson-doc-2.3.0.1-1.6.noarch.rpm"
RPM_HASH = "8fb71846514efa54b1a386137e33fbb0deba64f9087d8b2154d5fe9903139eae6ac4885cefae238215a6409b1bf93b23c35bc3009f86c1fe9b69379598f15460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-aeson-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
