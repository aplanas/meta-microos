SUMMARY = "Haskell attoparsec-iso8601 library documentation"
DESCRIPTION = "This package provides the Haskell attoparsec-iso8601 library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.0"

RPM_NAME = "ghc-attoparsec-iso8601-doc-1.1.0.0-3.4.noarch.rpm"
RPM_HASH = "42b829eeff5f7641df86266f121013060cf39e62eb1b2443e00298e270071e7c766d791bba7a4900cbc4c3ab4ac8627bd195ab0e8baba5c993714e7f12452b4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-attoparsec-iso8601-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
