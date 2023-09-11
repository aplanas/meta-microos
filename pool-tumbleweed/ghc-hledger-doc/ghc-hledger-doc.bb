SUMMARY = "Haskell hledger library documentation"
DESCRIPTION = "This package provides the Haskell hledger library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-doc-1.28-3.9.noarch.rpm"
RPM_HASH = "d79e840e1d2583d39dc8debe09f4bf972835553c2e41f33b0a702c0c32472496ad031a0d02839031a093245a78900f0c4e74ddbb7aa2e738c33d790bf7701ef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
