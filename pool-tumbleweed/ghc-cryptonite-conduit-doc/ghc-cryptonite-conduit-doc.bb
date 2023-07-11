SUMMARY = "Haskell cryptonite-conduit library documentation"
DESCRIPTION = "This package provides the Haskell cryptonite-conduit library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-cryptonite-conduit-doc-0.2.2-9.4.noarch.rpm"
RPM_HASH = "d7510e247b6088c0f8d4e1729a3768166aa79c0af1f957dbdabe34e3c82093f685a9cd04814a53de618e741d9cf88cd440109c4671990a5454dea28c5e2090bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptonite-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
