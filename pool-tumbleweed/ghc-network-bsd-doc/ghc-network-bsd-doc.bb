SUMMARY = "Haskell network-bsd library documentation"
DESCRIPTION = "This package provides the Haskell network-bsd library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.8.1.0"

RPM_NAME = "ghc-network-bsd-doc-2.8.1.0-7.2.noarch.rpm"
RPM_HASH = "7ed47f04341f43c57049a6bdeaa334ec694b88c4cba5ffe3f3d00369e165233046d45e4527ad41661c1e43e096ed5fc8e739d028c055b3408158a37578c00a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-bsd-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
