SUMMARY = "Haskell network library documentation"
DESCRIPTION = "This package provides the Haskell network library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.1.4.0"

RPM_NAME = "ghc-network-doc-3.1.4.0-2.1.noarch.rpm"
RPM_HASH = "fc70f567595e38c284848bacd82b63cd1d74f846a002f1a8dac54d06cc3f8a760d584364e70a913d8ecf751f27a4a4b6bd008c4685194558c5fcf268856e5e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
