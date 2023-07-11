SUMMARY = "Haskell skylighting library documentation"
DESCRIPTION = "This package provides the Haskell skylighting library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.3"

RPM_NAME = "ghc-skylighting-doc-0.13.3-1.2.noarch.rpm"
RPM_HASH = "500db32ea8a1174cff23dfa6be823381f0da895369bb3a81f9d1d86a6b1240c5d2a131eebd0ad79227cbfc891cdf093fc0935d02f592f855cfcc31e3a7c1faaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
