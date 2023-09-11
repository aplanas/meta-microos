SUMMARY = "Haskell aws library documentation"
DESCRIPTION = "This package provides the Haskell aws library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.23"

RPM_NAME = "ghc-aws-doc-0.23-1.12.noarch.rpm"
RPM_HASH = "2e0a2fff984c4417ee2bfcc80cab29ca99d71944d59a827a35b088e3871c39e76693a3584bde0844136891e260db3acc2d40d3cd6a0b3d7ed9c337b3a86730bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-aws-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
