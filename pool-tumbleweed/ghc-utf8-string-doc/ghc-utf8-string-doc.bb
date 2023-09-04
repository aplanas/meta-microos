SUMMARY = "Haskell utf8-string library documentation"
DESCRIPTION = "This package provides the Haskell utf8-string library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-doc-1.0.2-2.8.noarch.rpm"
RPM_HASH = "b96bef8199fb0b6187eb179ef60ba2d886691f129a50e05f2c6cfd794c3a3d1293edc7e80215aeaf0e70c57ab8188a29c35b81d00f776f93729be6909d3f18f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-utf8-string-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
