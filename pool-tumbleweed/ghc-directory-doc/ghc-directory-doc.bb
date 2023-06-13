SUMMARY = "Haskell directory library documentation"
DESCRIPTION = "This package provides the Haskell directory library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1"

RPM_NAME = "ghc-directory-doc-1.3.7.1-3.1.noarch.rpm"
RPM_HASH = "458ecca5a2c697dc50ed5c9df0d3b897c2a8e713715c82b24a837d8a472a77ac89ba7f38399db54a6e3b886cb52ee7bd22f2fa7a5c0828d5e7491f032f2ff67f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-directory-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
