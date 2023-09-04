SUMMARY = "Haskell x509-system library documentation"
DESCRIPTION = "This package provides the Haskell x509-system library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.7"

RPM_NAME = "ghc-x509-system-doc-1.6.7-2.8.noarch.rpm"
RPM_HASH = "a1baf1b4fc3c362096eb03e25397de30c1944e5c7c606e6af3a721c5f44f43fba1a9c80b33747bbac414519b32363e36d10a1c22baaa42f5c9688cb6a5cbabb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-x509-system-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
