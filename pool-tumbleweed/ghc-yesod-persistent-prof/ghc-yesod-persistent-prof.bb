SUMMARY = "Haskell yesod-persistent profiling library"
DESCRIPTION = "This package provides the Haskell yesod-persistent profiling library."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-prof-1.6.0.8-2.6.aarch64.rpm"
RPM_HASH = "fcc873783011bb847329836ab72f574fdb81cdab86580d07adcebbcf50948eab6d0dd3eb156b9dfac6ac8c2e35e0284928090c12c2b5d64c52699d1d102d2340"

RPROVIDES:${PN} += "ghc-prof-yesod-persistent-1.6.0.8-FGWkxx7rXiRFDcm3y5XVcs \
ghc-yesod-persistent-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-persistent-2.14.5.0-9uJ7TxdgaWz5Ow6lrik7k2 \
ghc-prof-resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-yesod-core-1.6.24.2-8wK3xEIlG3CBsmvalvvZaH \
ghc-yesod-persistent-devel"

inherit rpm
