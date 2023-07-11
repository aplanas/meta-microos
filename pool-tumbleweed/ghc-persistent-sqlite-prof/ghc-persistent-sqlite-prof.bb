SUMMARY = "Haskell persistent-sqlite profiling library"
DESCRIPTION = "This package provides the Haskell persistent-sqlite profiling library."
LICENSE = "MIT"

PV = "2.13.1.1"

RPM_NAME = "ghc-persistent-sqlite-prof-2.13.1.1-2.7.aarch64.rpm"
RPM_HASH = "593e803647e60bf09b39adff0909978ee0bb61a80dd24f840292022d40a5fe7d74eb7c3083830c1673e9eb69200ea49931e5fe5af6df16c63f238c10f2c6789a"

RPROVIDES:${PN} += "ghc-persistent-sqlite-prof \
ghc-prof-persistent-sqlite-2.13.1.1-86NT3YIJqhfIXbP1CwbNXp"

RDEPENDS:${PN} += "ghc-persistent-sqlite-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-containers-0.6.7 \
ghc-prof-microlens-th-0.4.3.13-4M5tTOX0ioLGTMiKBp6v2C \
ghc-prof-monad-logger-0.3.40-G052AHl2mRW3aPPonmcvVW \
ghc-prof-mtl-2.2.2 \
ghc-prof-persistent-2.14.5.0-9uJ7TxdgaWz5Ow6lrik7k2 \
ghc-prof-resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E"

inherit rpm
