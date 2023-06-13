SUMMARY = "Haskell magic library documentation"
DESCRIPTION = "This package provides the Haskell magic library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-magic-doc-1.1-4.3.noarch.rpm"
RPM_HASH = "5735d24b283a549e577e61fc22d82ce21ed724cab2dec00c1bfa369f6f8072d0d685b4d0f16d9b21104da8fee8b10e08570b153401306625158b06d1789371f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-magic-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
