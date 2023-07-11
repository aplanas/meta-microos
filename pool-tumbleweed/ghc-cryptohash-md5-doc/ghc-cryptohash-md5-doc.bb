SUMMARY = "Haskell cryptohash-md5 library documentation"
DESCRIPTION = "This package provides the Haskell cryptohash-md5 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-md5-doc-0.11.101.0-4.6.noarch.rpm"
RPM_HASH = "4a857ab535734cc8ffe3b95bf6e15a77f01b7168a7c79563478ff7cf83d5e86ff8da75ad5bd0397291654856a5126bde9f464f4a9fc7f3923984a6774608b6fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cryptohash-md5-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
