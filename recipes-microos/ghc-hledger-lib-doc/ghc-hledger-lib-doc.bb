SUMMARY = "Haskell hledger-lib library documentation"
DESCRIPTION = "This package provides the Haskell hledger-lib library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-lib-doc-1.28-2.4.noarch.rpm"
RPM_HASH = "ac710e3f3c0ebb4f9cba653d63163c065f220946184bcef57c1d37dc62542ce8e86c8d1ecd1313e2bd0822937a7dbb43d839815241181819b76f83131774015b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-lib-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
