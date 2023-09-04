SUMMARY = "Haskell cryptohash-md5 library documentation"
DESCRIPTION = "This package provides the Haskell cryptohash-md5 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-md5-doc-0.11.101.0-4.8.noarch.rpm"
RPM_HASH = "ba8975e63a8a600655887a5b768d6e0efd80fe4df745fcd9c85053356a738db8840241cfaa68a6bb464cbffdd9d7768ca7daa6b7732490b7910a34ff25d93253"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptohash-md5-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
