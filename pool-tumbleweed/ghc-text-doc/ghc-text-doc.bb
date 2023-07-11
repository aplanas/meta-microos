SUMMARY = "Haskell text library documentation"
DESCRIPTION = "This package provides the Haskell text library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "ghc-text-doc-2.0.2-3.2.noarch.rpm"
RPM_HASH = "ea20881018ccf19fd79abbada55ff086055181547a07e9525e8b46bbd1372f18c60258a6ee806ae48a47b9d8fabc8e70a6f113ff125b65a2b342e16672850792"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
