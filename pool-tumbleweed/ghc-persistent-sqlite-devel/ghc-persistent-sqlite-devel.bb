SUMMARY = "Haskell persistent-sqlite library development files"
DESCRIPTION = "This package provides the Haskell persistent-sqlite library development \
files."
LICENSE = "MIT"

PV = "2.13.1.1"

RPM_NAME = "ghc-persistent-sqlite-devel-2.13.1.1-2.7.aarch64.rpm"
RPM_HASH = "aae62f1ade7ff9fdfb19c7b1a37153fcd5d358d7740adef689dc73376f788274028b3ec75f9dce5b1ef73c87ac2a532abb71122c020a58ad650ffe4ca8f0eaf3"

RPROVIDES:${PN} += "ghc-devel-persistent-sqlite-2.13.1.1-86NT3YIJqhfIXbP1CwbNXp \
ghc-persistent-sqlite-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-containers-0.6.7 \
ghc-devel-microlens-th-0.4.3.13-4M5tTOX0ioLGTMiKBp6v2C \
ghc-devel-monad-logger-0.3.40-G052AHl2mRW3aPPonmcvVW \
ghc-devel-mtl-2.2.2 \
ghc-devel-persistent-2.14.5.0-9uJ7TxdgaWz5Ow6lrik7k2 \
ghc-devel-resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-persistent-sqlite \
glibc-devel \
sqlite3-devel"

inherit rpm
