SUMMARY = "Haskell base64 library documentation"
DESCRIPTION = "This package provides the Haskell base64 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.4"

RPM_NAME = "ghc-base64-doc-0.4.2.4-3.6.noarch.rpm"
RPM_HASH = "a53fdb78452fda45a5ab15ab6de0c6d4ec808b8a1e1478e6cb6820d62adb3e372b73f8cfd4596a2d1c1a79d14f445aae2c8265d004c9f3a09b50916e22c78ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base64-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
