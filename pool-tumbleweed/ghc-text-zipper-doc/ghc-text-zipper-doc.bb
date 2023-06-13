SUMMARY = "Haskell text-zipper library documentation"
DESCRIPTION = "This package provides the Haskell text-zipper library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.12"

RPM_NAME = "ghc-text-zipper-doc-0.12-2.2.noarch.rpm"
RPM_HASH = "c1f6f2eb5e178df045a8f55e87859519299d97cee5aada010f1f78c2dc95a766d8d73c2c525a1966788a5a127502b31e45395c2b2cfb2a7684440098c564a37d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-zipper-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
