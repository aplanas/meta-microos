SUMMARY = "Haskell primitive library documentation"
DESCRIPTION = "This package provides the Haskell primitive library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.4.0"

RPM_NAME = "ghc-primitive-doc-0.7.4.0-1.6.noarch.rpm"
RPM_HASH = "dd0ec99176fd1cc0b2b0a44dbc3c7e9b3f1543510c01aa422bda13969bdf6a5557f740ae53742e99fe7d0ab89f686c7dacca65bc285c5c0d2a8ab582ca3fd7e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-primitive-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
