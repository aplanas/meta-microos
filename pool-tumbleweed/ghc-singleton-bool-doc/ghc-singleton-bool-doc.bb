SUMMARY = "Haskell singleton-bool library documentation"
DESCRIPTION = "This package provides the Haskell singleton-bool library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-singleton-bool-doc-0.1.6-4.2.noarch.rpm"
RPM_HASH = "4eb5ef1a8360bac51a32cb2e0d436a12752cc0f77acf7fff33c974c2d523e51c0bd973c521f7ed075a57be6a9630ac13453efa8087268183928f0ceb40599f96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-singleton-bool-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
