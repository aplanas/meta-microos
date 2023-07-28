SUMMARY = "Haskell skylighting library documentation"
DESCRIPTION = "This package provides the Haskell skylighting library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.4"

RPM_NAME = "ghc-skylighting-doc-0.13.4-1.1.noarch.rpm"
RPM_HASH = "b14659a90a9def6e496ca26cac2255d967089c68bcad6f00b87776ffd934d78d9b1e79246aa6859f7c4c3540c964fb9623c5b89e9ad996fda22c564ed5607295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
