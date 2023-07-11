SUMMARY = "Haskell regex-base profiling library"
DESCRIPTION = "This package provides the Haskell regex-base profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.2"

RPM_NAME = "ghc-regex-base-prof-0.94.0.2-3.6.aarch64.rpm"
RPM_HASH = "1e69931d89dc63585a56c218ff66f309b812938bd1c27f6158ddf9fa237165fe6f4b07b0f15708494dc128543e8140514fc21962e7d1d291118788718a3cc661"

RPROVIDES:${PN} += "ghc-prof-regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq \
ghc-regex-base-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-text-2.0.2 \
ghc-regex-base-devel"

inherit rpm
