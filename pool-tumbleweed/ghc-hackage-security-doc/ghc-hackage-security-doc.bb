SUMMARY = "Haskell hackage-security library documentation"
DESCRIPTION = "This package provides the Haskell hackage-security library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.2.3"

RPM_NAME = "ghc-hackage-security-doc-0.6.2.3-1.7.noarch.rpm"
RPM_HASH = "1e7fd4440c99925adec6c6573afce7a4f276f8190b3ea6a9b6af188f19ecec44d54564c7c1cdf0a7f9629b17ae61ebb7cb8f29d401ffefc0d373239401d2b586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hackage-security-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
