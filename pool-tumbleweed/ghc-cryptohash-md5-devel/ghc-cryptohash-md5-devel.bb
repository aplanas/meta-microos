SUMMARY = "Haskell cryptohash-md5 library development files"
DESCRIPTION = "This package provides the Haskell cryptohash-md5 library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-md5-devel-0.11.101.0-4.6.aarch64.rpm"
RPM_HASH = "cd29820680a0d6d2ba4193cda2dcd2de6aab0cfc34dfae5d6e75e3e06a742ff90ced8f6b553e4c5b5bfe1f3fbe5110181ecf9e9010075aceec32a3e18821cbc9"

RPROVIDES:${PN} += "ghc-cryptohash-md5-devel \
ghc-devel-cryptohash-md5-0.11.101.0-1tswcJp9v68CZlxGZzmcPV"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptohash-md5 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0"

inherit rpm
