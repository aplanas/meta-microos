SUMMARY = "Haskell bencode library documentation"
DESCRIPTION = "This package provides the Haskell bencode library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-doc-0.6.1.1-4.6.noarch.rpm"
RPM_HASH = "f6f8501ee5208c9cdbf72f627d6e18189a33ad59b27334cf16081fb87b6ee2f49b0526852cc7d063214cc413e9d6a9d538026114c10acc897505780cc506fa74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bencode-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
