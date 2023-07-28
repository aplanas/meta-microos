SUMMARY = "Haskell yesod-persistent profiling library"
DESCRIPTION = "This package provides the Haskell yesod-persistent profiling library."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-prof-1.6.0.8-2.10.aarch64.rpm"
RPM_HASH = "226a362e5865a7191ee729dc2fb7d326ac844e80bdcbf4d04c50229f5f7fdd0815f5f0e3d892aeecc8341593674183fa8648f071d63b24568768cbafa80831a2"

RPROVIDES:${PN} += "ghc-prof-yesod-persistent-1.6.0.8-A587fdCgueU2UmsZUmFzaX \
ghc-yesod-persistent-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-persistent-2.14.5.1-8aZiHAHWity6p3rqRx3MdJ \
ghc-prof-resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-yesod-core-1.6.24.3-FuwsWoOUEyTCufqnix4g5P \
ghc-yesod-persistent-devel"

inherit rpm
