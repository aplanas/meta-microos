SUMMARY = "Haskell parsec library documentation"
DESCRIPTION = "This package provides the Haskell parsec library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.16.1"

RPM_NAME = "ghc-parsec-doc-3.1.16.1-1.1.noarch.rpm"
RPM_HASH = "57989075386fc79b70be5cc778b4ec55452850064129ce8f4e47aa22a231269d648667f19410a2585ecb1e24db5f8f9ba8ac82f95f46a731edc79961fd505cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parsec-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
