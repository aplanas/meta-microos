SUMMARY = "Haskell unix library documentation"
DESCRIPTION = "This package provides the Haskell unix library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-doc-2.7.3-1.1.noarch.rpm"
RPM_HASH = "5e96d88ba532dd0bcb086216c444cd92c8bb28720aec3868b0e321ac90128cddac779ac79f99d767b0ddecf19e723284d5d505a17248eff7c9a51f71c435657d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
