SUMMARY = "Haskell yesod-persistent profiling library"
DESCRIPTION = "This package provides the Haskell yesod-persistent profiling library."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-prof-1.6.0.8-2.4.aarch64.rpm"
RPM_HASH = "89fc2bea7e650a3e2bfba1ae9d9df9a42ebab804df15ffc1a1075e77ee7e5fa344b3413ea9b5343786428ff267101a7281b20ed7a89e4aa6fb6d0d5ceeb1174f"

RPROVIDES:${PN} += "ghc-prof-yesod-persistent-1.6.0.8-DUd8QtbJfktGowTUT2pCEk \
ghc-yesod-persistent-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-prof-conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2 \
ghc-prof-persistent-2.14.5.0-52EbT4CA3Ct4CmrnsbaA80 \
ghc-prof-resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-yesod-core-1.6.24.2-DExtrbWuaUvstmq3VZuwG \
ghc-yesod-persistent-devel"

inherit rpm
