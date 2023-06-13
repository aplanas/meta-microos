SUMMARY = "Haskell skylighting-format-ansi library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-ansi library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-ansi-doc-0.1-2.3.noarch.rpm"
RPM_HASH = "c498dbf4d3e8d2454440c160c82e489c9c227b21c5e270507227f82d1292b462bd8e8e3587fc3668f42b882d1457cf0a76adb0c99fc7eb4f5b1aa9f7123001bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-ansi-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
