SUMMARY = "Haskell transformers-compat library documentation"
DESCRIPTION = "This package provides the Haskell transformers-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "ghc-transformers-compat-doc-0.7.2-2.8.noarch.rpm"
RPM_HASH = "e62d3201a381a5f91cf7cf40bd1d0b2e51f0dc03fd00a4a98735c1edafee2b0e6419acce7d70258fccc16ff095db5297a4487144da42631e7ccfa7965d50d323"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-transformers-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
