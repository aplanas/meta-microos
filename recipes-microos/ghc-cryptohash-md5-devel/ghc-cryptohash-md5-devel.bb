SUMMARY = "Haskell cryptohash-md5 library development files"
DESCRIPTION = "This package provides the Haskell cryptohash-md5 library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-md5-devel-0.11.101.0-4.3.aarch64.rpm"
RPM_HASH = "72d6b3d6e847991446d0d36fa9e22ff8c2e8fe70b272a2e143e9bdeec3156f93cc9c715e5742b98f57717cb611536384eadb4b912655b2db82f574e062f46ba0"

RPROVIDES:${PN} += "ghc-cryptohash-md5-devel ghc-cryptohash-md5-devel(aarch-64) ghc-devel(cryptohash-md5-0.11.101.0-1tswcJp9v68CZlxGZzmcPV)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-cryptohash-md5 ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0)"

inherit rpm
