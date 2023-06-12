SUMMARY = "Haskell mountpoints library documentation"
DESCRIPTION = "This package provides the Haskell mountpoints library documentation."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-doc-1.0.2-4.2.noarch.rpm"
RPM_HASH = "9de4729b4ecbf5bb00f709c68c513de4d9917ebc4dfa31e4178674797f2ad3091446f1df8f1bbb25f07c16f10f720444e755881edc34c88f164604fd4a20896c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mountpoints-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
