SUMMARY = "Haskell pretty library documentation"
DESCRIPTION = "This package provides the Haskell pretty library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-doc-1.1.3.6-3.1.noarch.rpm"
RPM_HASH = "1efc38e4a10e180179efb0c286eae745dc0aca432e3a69032359e8620369b01fabbcf7b4736d545c44a50f29cb67ed6ca59e55a9e6343009ed4706835f5a8142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
