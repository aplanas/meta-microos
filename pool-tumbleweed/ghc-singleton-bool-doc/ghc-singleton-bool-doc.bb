SUMMARY = "Haskell singleton-bool library documentation"
DESCRIPTION = "This package provides the Haskell singleton-bool library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-singleton-bool-doc-0.1.6-4.4.noarch.rpm"
RPM_HASH = "067f8ef115625ed57b308989f5185410f7857d3a57a2ca45c404f291de4f7a9ce0dd9bbeeaa808ecefd3d59c45b877311ff1f8c7904ed6ba56d4835a960de7d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-singleton-bool-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
