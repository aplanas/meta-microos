SUMMARY = "Haskell skylighting-core library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.2.1"

RPM_NAME = "ghc-skylighting-core-doc-0.13.2.1-1.4.noarch.rpm"
RPM_HASH = "9092c54262d344e9df51aa4a64e04e30d978e24668287bcf716b0d1d0b52eef60c000fe60808c47077d961a7cf3e522f72b4126bc67444941d6aca24de74db35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-core-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
