SUMMARY = "Haskell bitvec library documentation"
DESCRIPTION = "This package provides the Haskell bitvec library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.5.0"

RPM_NAME = "ghc-bitvec-doc-1.1.5.0-1.1.noarch.rpm"
RPM_HASH = "87444f54dbdd9141fbb640df9fd02845cc90501337426406ea15504f824c7fa19fd59c6337746dbbd9ef447ee6a78e9c18de2feccad2c86b3ac5b3f47475e620"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bitvec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
