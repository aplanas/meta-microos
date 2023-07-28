SUMMARY = "Haskell regex-base profiling library"
DESCRIPTION = "This package provides the Haskell regex-base profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.2"

RPM_NAME = "ghc-regex-base-prof-0.94.0.2-4.1.aarch64.rpm"
RPM_HASH = "94d6081b6bf44bc18bb030bbf897a2a3be3ffe7077e6ad988922aba7d4ba7787d74ba2b40b33b5f44c71c4c3cc9b8fc0d6fdcb6a6cd0ee5e172f7f5bc7d8d612"

RPROVIDES:${PN} += "ghc-prof-regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq \
ghc-regex-base-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-text-2.0.2 \
ghc-regex-base-devel"

inherit rpm
