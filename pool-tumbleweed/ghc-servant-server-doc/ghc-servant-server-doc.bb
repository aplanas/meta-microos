SUMMARY = "Haskell servant-server library documentation"
DESCRIPTION = "This package provides the Haskell servant-server library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "ghc-servant-server-doc-0.19.2-2.12.noarch.rpm"
RPM_HASH = "bd9e2a7ae0a717780532d12a697377a7b6e48f0d8396ca0e91981f1a10adfff0c3670c236353921a5a11e885d6be7c9f4dc2671c10cd38f77aed0163dfc7b49a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-servant-server-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
