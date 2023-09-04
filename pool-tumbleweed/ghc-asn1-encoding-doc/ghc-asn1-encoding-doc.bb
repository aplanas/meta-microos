SUMMARY = "Haskell asn1-encoding library documentation"
DESCRIPTION = "This package provides the Haskell asn1-encoding library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "ghc-asn1-encoding-doc-0.9.6-8.8.noarch.rpm"
RPM_HASH = "499274149c59bde93059917f899edc5edd00ddf38790b08d7f57bf5528fd240294ae0c000f444723945f6288e681c9eb6427e29f4c6b4262d5ec5b5c0e4f14a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-asn1-encoding-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
