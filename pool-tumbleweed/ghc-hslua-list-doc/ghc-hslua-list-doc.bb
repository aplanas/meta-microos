SUMMARY = "Haskell hslua-list library documentation"
DESCRIPTION = "This package provides the Haskell hslua-list library documentation."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-hslua-list-doc-1.1.1-2.4.noarch.rpm"
RPM_HASH = "2af26331f80536d7ddadcaa5835dc6bee430d0f30435a0b96f7d77e8b97afdf3b36e8763a7f1e4b57e79a06d69648861f31c1ef4184a9a66a7c10d8bf23e4ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-list-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
