SUMMARY = "Haskell netlink library documentation"
DESCRIPTION = "This package provides the Haskell netlink library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-doc-1.1.1.0-4.3.noarch.rpm"
RPM_HASH = "653c5644e482d57ee41d9e16268829571f22f66802b6c264a8ca61891400b3ac4a303916a8814df13ec0be4e8bc237023e1b32aad129ebb7e527271ea3c690f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-netlink-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
