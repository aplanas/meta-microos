SUMMARY = "Haskell unix-time profiling library"
DESCRIPTION = "This package provides the Haskell unix-time profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.10"

RPM_NAME = "ghc-unix-time-prof-0.4.10-1.3.aarch64.rpm"
RPM_HASH = "6cde898a0ae226fae2ab43deee25ae50cefc0be1c3771b3ba3bec44588e75bde0e97ee8e992cfe5b20eba06fe8a96f46c022f89e188cf6c503b05391122cdc19"

RPROVIDES:${PN} += "ghc-prof-unix-time-0.4.10-fuTENic3zHIuWAM5F0fYB \
ghc-unix-time-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-old-time-1.1.0.3-EO4BkAubfN4CLCS9qF8OKw \
ghc-unix-time-devel"

inherit rpm
