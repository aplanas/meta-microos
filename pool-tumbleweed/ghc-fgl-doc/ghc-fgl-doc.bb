SUMMARY = "Haskell fgl library documentation"
DESCRIPTION = "This package provides the Haskell fgl library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.8.0.0"

RPM_NAME = "ghc-fgl-doc-5.8.0.0-2.3.noarch.rpm"
RPM_HASH = "6616cab2c6b4f2e51f050ecd499750604cf94e587f9fc22ad7d4d51024b20fb84cd35bf011822c84901befbab030869df3f47fe96d185b3f7201b15479bbd1ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fgl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
