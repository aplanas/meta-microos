SUMMARY = "Haskell old-time library documentation"
DESCRIPTION = "This package provides the Haskell old-time library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.3"

RPM_NAME = "ghc-old-time-doc-1.1.0.3-13.3.noarch.rpm"
RPM_HASH = "96e6b43581b7d12ada0be055ad5695805f03727bef6c0c97752f0e097c6262e99f398c02650c6e62f748913a64074893ca66377456fdb72a8b3638d025a86f3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-old-time-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
