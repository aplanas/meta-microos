SUMMARY = "Haskell netlink library documentation"
DESCRIPTION = "This package provides the Haskell netlink library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-doc-1.1.1.0-4.8.noarch.rpm"
RPM_HASH = "2c3b07f6cba5556751b1f3a74243f2469af41b3c4b90dcb163cbf365769f74cc5bd0ec0a4b2fe804ebc864b03d116a5188a6a1fd2626f1e66ef5ec832782cce9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-netlink-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
