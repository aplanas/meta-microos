SUMMARY = "Haskell netlink library documentation"
DESCRIPTION = "This package provides the Haskell netlink library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-netlink-doc-1.1.1.0-4.6.noarch.rpm"
RPM_HASH = "62ae27ffa1c7524e08c2d022d60f15f00eaeb9dbcf78efe0036582fb80163fa618464b3899a85bebec63ddb6e55b3d7a700c6ec0591f48cfa7d6c5c41c0370f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-netlink-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
