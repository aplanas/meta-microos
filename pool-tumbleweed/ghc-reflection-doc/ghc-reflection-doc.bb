SUMMARY = "Haskell reflection library documentation"
DESCRIPTION = "This package provides the Haskell reflection library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.1.7"

RPM_NAME = "ghc-reflection-doc-2.1.7-1.3.noarch.rpm"
RPM_HASH = "00fb0efd434b419244a1a9196b2714375e0c4bc9c13db4e2ac181b13d1cbd0a1fc87ac851d853389e8788ea63c3e75ed1428fb183bdaa8b2657f4069fb1e0fd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-reflection-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
