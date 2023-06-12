SUMMARY = "Haskell cryptohash-md5 profiling library"
DESCRIPTION = "This package provides the Haskell cryptohash-md5 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.101.0"

RPM_NAME = "ghc-cryptohash-md5-prof-0.11.101.0-4.3.aarch64.rpm"
RPM_HASH = "1f14619fc3bad9290c842f7483ba92b8fe9a7c4497d52507dd6886c4803f0a91d353cc03d085d0c60686f5b2a4dfc92e8fa2eb02c8935036801457b298e1c8db"

RPROVIDES:${PN} += "ghc-cryptohash-md5-prof \
ghc-cryptohash-md5-prof(aarch-64) \
ghc-prof(cryptohash-md5-0.11.101.0-1tswcJp9v68CZlxGZzmcPV)"
RDEPENDS:${PN} += "ghc-cryptohash-md5-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0)"

inherit rpm
