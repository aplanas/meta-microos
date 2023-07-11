SUMMARY = "Haskell x509 library documentation"
DESCRIPTION = "This package provides the Haskell x509 library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.7.7"

RPM_NAME = "ghc-x509-doc-1.7.7-2.6.noarch.rpm"
RPM_HASH = "036539d763dc66977829035b3c8438b4977766ae1a58d285ddadabcbabfc47d994c65a5e0899dcb6fcb35ef0be8a9ef6cfaae608b4ea2649962219f32ed5e2c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-x509-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
