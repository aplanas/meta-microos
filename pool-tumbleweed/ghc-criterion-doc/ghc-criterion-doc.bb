SUMMARY = "Haskell criterion library documentation"
DESCRIPTION = "This package provides the Haskell criterion library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-criterion-doc-1.6.2.0-2.2.noarch.rpm"
RPM_HASH = "2bab72e07f002ad286e46387bb872e1cc32fcf7ddf6a4e6f14d3d1a0fac4cae4893afba398dfaa2a06638c7ab96bbe851a9f78bb8191ade57b79ade250e657cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-criterion-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
