SUMMARY = "Haskell unliftio-core library documentation"
DESCRIPTION = "This package provides the Haskell unliftio-core library documentation."
LICENSE = "MIT"

PV = "0.2.1.0"

RPM_NAME = "ghc-unliftio-core-doc-0.2.1.0-1.3.noarch.rpm"
RPM_HASH = "430208991291379990b769d4a27ee4a54de93f0299acb99f03cfeef438dd1fe78a057f16dc70d6ce2021babdb9f902df4ffe4bc3d6836e7f266798777d57b551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unliftio-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
