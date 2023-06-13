SUMMARY = "Haskell tar library documentation"
DESCRIPTION = "This package provides the Haskell tar library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.1"

RPM_NAME = "ghc-tar-doc-0.5.1.1-11.3.noarch.rpm"
RPM_HASH = "ac18dae4b437d4dd804ee974e73a40308d4e7902800189d764f6c4d9754eb3d67b3422d9dbb258405e285f08ddc352dc1392eb097de8cefc3b211ebb6a9544c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tar-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
