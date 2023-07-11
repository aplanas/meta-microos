SUMMARY = "Haskell unicode-transforms library documentation"
DESCRIPTION = "This package provides the Haskell unicode-transforms library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-transforms-doc-0.4.0.1-4.6.noarch.rpm"
RPM_HASH = "86fba53770789699154ee8e96e1fe87284729065f00c2c259edbf534d2b391fe59e489a0c3538f7ea78898c22791c252ccaeceaf8f04d3f2ecdb3c2b083cf3a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unicode-transforms-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
