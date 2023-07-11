SUMMARY = "Haskell terminal-size library documentation"
DESCRIPTION = "This package provides the Haskell terminal-size library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-doc-0.3.4-1.3.noarch.rpm"
RPM_HASH = "7585370b2352fbb6ca0b549f9be32fc22d141b8eac1e0fedf32026e8a7fd58f2a303d6a6d19f4876f6f3616789552fce0708607c419c455de4891c1547ee62b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-terminal-size-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
