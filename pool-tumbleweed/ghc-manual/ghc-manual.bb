SUMMARY = "GHC manual"
DESCRIPTION = "This package provides the User Guide and Haddock manual."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-manual-9.4.5-3.1.noarch.rpm"
RPM_HASH = "4967d18ed71221737708fd877519d4e35df8a796f6f2ac0ba03e439a7e530691d7b740a457be7991440c4cfebe4c6b27e4e7002129393b766eba4e4190bd54d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-manual"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
