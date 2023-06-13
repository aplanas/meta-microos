SUMMARY = "Haskell process library documentation"
DESCRIPTION = "This package provides the Haskell process library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.16.0"

RPM_NAME = "ghc-process-doc-1.6.16.0-3.1.noarch.rpm"
RPM_HASH = "896e126eb813f573577594782d2298dca052eea7a3d537561870bfbbd587928c03e54d8d6f98afee315feda6e2607480e1c220245d5b0cdf96278c48b5d70fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-process-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
