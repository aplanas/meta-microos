SUMMARY = "Haskell time library documentation"
DESCRIPTION = "This package provides the Haskell time library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-doc-1.12.2-1.1.noarch.rpm"
RPM_HASH = "e678a9637e5eea2080f2a3a9f0e375a3327c00e438d75adb9a6ff71ee189b4663634d7530bb65a45ad15092f88b0584fd7208bf7f662c0cf4e30b7b44fd16c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-time-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
