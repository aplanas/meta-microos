SUMMARY = "Haskell cryptonite-conduit library documentation"
DESCRIPTION = "This package provides the Haskell cryptonite-conduit library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-cryptonite-conduit-doc-0.2.2-9.7.noarch.rpm"
RPM_HASH = "3469c6ba0899a0603b6b72d7db4d04914339da4ff185f13877aa07c58b0954bf2d7a9e0aa24fcb1cc052b4ae691b9d1d4864ccbbd60d62a83d44f688e4614f0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptonite-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
