SUMMARY = "Haskell base64-bytestring library documentation"
DESCRIPTION = "This package provides the Haskell base64-bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-doc-1.2.1.0-2.6.noarch.rpm"
RPM_HASH = "c57026b073ba20dcab71cdae1ced1109b1cc0af97abe8fca463d5e318e8e42a4da5d63c2fca20334a0cf457ec5d8f655071c20b328404721b8f9ea5ce48215d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base64-bytestring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
