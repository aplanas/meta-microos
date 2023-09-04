SUMMARY = "Haskell vector-binary-instances library documentation"
DESCRIPTION = "This package provides the Haskell vector-binary-instances library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.5.2"

RPM_NAME = "ghc-vector-binary-instances-doc-0.2.5.2-6.2.noarch.rpm"
RPM_HASH = "7796cd2e3dd2204aa4e7fb8c7713c85e95dd469909739c1186c16b1ffc93e51ef1d2c07b71d2d684c629a04eb41017a226be4752a5bdcf690a18241ae5e5faa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vector-binary-instances-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
