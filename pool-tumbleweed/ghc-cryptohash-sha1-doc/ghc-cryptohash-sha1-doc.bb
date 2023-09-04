SUMMARY = "Haskell cryptohash-sha1 library documentation"
DESCRIPTION = "This package provides the Haskell cryptohash-sha1 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-sha1-doc-0.11.101.0-4.8.noarch.rpm"
RPM_HASH = "b85b29b3bba5d22145509ede173a624880d0c948d4629fd4dd94d226f0af92a9f1f537e89164795ef924bc15c6fad78ab5eda2c5b2adbed9ef9d315877a9f6bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptohash-sha1-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
