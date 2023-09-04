SUMMARY = "Haskell hledger-lib library documentation"
DESCRIPTION = "This package provides the Haskell hledger-lib library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-lib-doc-1.28-3.7.noarch.rpm"
RPM_HASH = "0ace22cb40a6f7df5225225fd5b859019f7eb6b4740da47dfd717735e2679299cfb5d98237e415e689750413f66d311ec5f51b738cd35f763528586164ec72f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-lib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
