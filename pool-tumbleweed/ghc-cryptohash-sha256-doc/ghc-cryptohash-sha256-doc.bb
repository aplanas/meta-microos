SUMMARY = "Haskell cryptohash-sha256 library documentation"
DESCRIPTION = "This package provides the Haskell cryptohash-sha256 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.102.1"

RPM_NAME = "ghc-cryptohash-sha256-doc-0.11.102.1-3.3.noarch.rpm"
RPM_HASH = "1456e500dc7f64a3a06a9bcc3a1c61cd13f03da0b87279843b156f12c043dc7ccfc82ffe6bfef295de2aa112d90772c1d2ff59fdc3239f11a3d38db0f20f273b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptohash-sha256-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
