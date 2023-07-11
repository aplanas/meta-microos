SUMMARY = "Haskell vector library documentation"
DESCRIPTION = "This package provides the Haskell vector library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.0.0"

RPM_NAME = "ghc-vector-doc-0.13.0.0-1.6.noarch.rpm"
RPM_HASH = "9b3bc6cd75b581147a42cf0c7763ece56cc07bb1b32c45fe908cb19eee0011adcd76692101bfcb6be2bc725c2516a1336f99fd51bbc38862fb0be42d6123c8cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
