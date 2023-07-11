SUMMARY = "Haskell hpc library documentation"
DESCRIPTION = "This package provides the Haskell hpc library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.0"

RPM_NAME = "ghc-hpc-doc-0.6.1.0-3.2.noarch.rpm"
RPM_HASH = "cc5e2e5209f2621475d26617d8ca4043f1a72fbc7e4c049e40990c324e8dd4d202c4222a2bcf7193003753d748471c0900b745ee7bf564220d69806e63aa3476"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hpc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
