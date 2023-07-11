SUMMARY = "Haskell skein library documentation"
DESCRIPTION = "This package provides the Haskell skein library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.9.4"

RPM_NAME = "ghc-skein-doc-1.0.9.4-4.3.noarch.rpm"
RPM_HASH = "f8817471334155a310f18342ef456a68da60696e8c5a8fb5b70eacfd0f72d84031fe87bb0e4574418f8849979812715cf79f9bd955eec7ece13cfc4f615225c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skein-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
