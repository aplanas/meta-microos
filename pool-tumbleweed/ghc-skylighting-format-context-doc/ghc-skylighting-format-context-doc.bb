SUMMARY = "Haskell skylighting-format-context library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-context library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-doc-0.1.0.2-1.11.noarch.rpm"
RPM_HASH = "49c538b036ba35f72c6bb679d9476393c09b3806b6d35be030df55b2bdfa4a7898678cc9c1e5ae9df005a580abcae9055580712db97bbbea2b149bb386e10292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-context-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
