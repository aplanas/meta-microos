SUMMARY = "Haskell bloomfilter profiling library"
DESCRIPTION = "This package provides the Haskell bloomfilter profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.0"

RPM_NAME = "ghc-bloomfilter-prof-2.0.1.0-6.3.aarch64.rpm"
RPM_HASH = "d92c8c2c7d4451f9257bf8e6e60240ffff84b1924a63892a25bda2a8edc13826244e8b6d067cb137821fa2418ec74d7d092d41fc3babf5f2b16139b53adb20b0"

RPROVIDES:${PN} += "ghc-bloomfilter-prof \
ghc-bloomfilter-prof(aarch-64) \
ghc-prof(bloomfilter-2.0.1.0-3hF1ySDPbPQA7KQQeHgCqI)"
RDEPENDS:${PN} += "ghc-bloomfilter-devel \
ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(deepseq-1.4.8.0)"

inherit rpm
