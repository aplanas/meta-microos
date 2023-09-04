SUMMARY = "Haskell mountpoints library documentation"
DESCRIPTION = "This package provides the Haskell mountpoints library documentation."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-doc-1.0.2-4.4.noarch.rpm"
RPM_HASH = "ded4854a82394be907e89553a092906fb10e4ff0230cd17625285ab2457f74dbab51340769206a6353478d9010637fc2a801ae60fb5c2b7ab002bf9fec023292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mountpoints-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
