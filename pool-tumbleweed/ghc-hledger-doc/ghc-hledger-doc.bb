SUMMARY = "Haskell hledger library documentation"
DESCRIPTION = "This package provides the Haskell hledger library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-doc-1.28-2.5.noarch.rpm"
RPM_HASH = "017dbdefe9cb7241a3a2310f58f4ada665dfcc42f18653aa035aa983ba7b22d88d827d182ff4781f8b508a2d685ff33a2d547953714657e30a78c6fc666aacdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
