SUMMARY = "Haskell optics-core library documentation"
DESCRIPTION = "This package provides the Haskell optics-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-optics-core-doc-0.4.1-2.3.noarch.rpm"
RPM_HASH = "7f9a33a9540fb0edb2c6420ae4d3a396da2fced583f0837c8d1b64230f92b00dc6b1e015b877624c5176427e54f2f4d6f9962c9b2ecc1ce189a971a42153e591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-optics-core-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
