SUMMARY = "Haskell case-insensitive library documentation"
DESCRIPTION = "This package provides the Haskell case-insensitive library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-case-insensitive-doc-1.2.1.0-6.2.noarch.rpm"
RPM_HASH = "0d8865c1a2cdc4409fe96e591a3fd4234317216ad3e173581f0b9e3b92cd351432ec41c4b0d1efd9b479469541c15b189a02e1068330865711a537e953fcb8e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-case-insensitive-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
