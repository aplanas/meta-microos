SUMMARY = "Haskell cassava library documentation"
DESCRIPTION = "This package provides the Haskell cassava library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.3.0"

RPM_NAME = "ghc-cassava-doc-0.5.3.0-2.6.noarch.rpm"
RPM_HASH = "4f99af9cd2ae3675447ac2c0611949e07d73d68d7b7b0068210a4da214320e00c6ba767dd17b7d5cbe9e9028af5bba5a85ce3374dd698e38064b81fab4aa8ad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cassava-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
