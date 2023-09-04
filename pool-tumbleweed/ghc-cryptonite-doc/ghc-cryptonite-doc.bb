SUMMARY = "Haskell cryptonite library documentation"
DESCRIPTION = "This package provides the Haskell cryptonite library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.30"

RPM_NAME = "ghc-cryptonite-doc-0.30-2.8.noarch.rpm"
RPM_HASH = "d19128e4ccebb2f00a7d7836ad3868a1a4f2fde084a1fb49d8280507ccfeb4a0e9b3a55d0986888eb9d536958075a9e72c2a8f4e9ba5dec11e051a96e496d4a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptonite-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
