SUMMARY = "Haskell Decimal library documentation"
DESCRIPTION = "This package provides the Haskell Decimal library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "ghc-Decimal-doc-0.5.2-2.2.noarch.rpm"
RPM_HASH = "f6d51a59a34881f2e61567280cf582a5e2f9928fb216d4b075ce7385b39c7709762a41c5ac1f7404be13b32e398e76a1cf114d25e549a0bd66b55f7ab2ac4cc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Decimal-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
