SUMMARY = "Haskell transformers-base library documentation"
DESCRIPTION = "This package provides the Haskell transformers-base library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "ghc-transformers-base-doc-0.4.6-2.2.noarch.rpm"
RPM_HASH = "cde1b7be058580df184f13f1729a049fac145df077118b67a2cfbcc7416354514696ec86c70a32e256ed6007249163ae86847314c7085730f51f68c41aadb576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-transformers-base-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
