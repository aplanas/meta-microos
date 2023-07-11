SUMMARY = "Haskell yesod-persistent library development files"
DESCRIPTION = "This package provides the Haskell yesod-persistent library development \
files."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-devel-1.6.0.8-2.6.aarch64.rpm"
RPM_HASH = "a0fe3528daaa88cdd847b95b3e794592e68136c5ecc72ffeb28574a5958e05482c242be2e51bb741e5634b6863fb371aa2b3d57c91cb6b01a02bc38359f67898"

RPROVIDES:${PN} += "ghc-devel-yesod-persistent-1.6.0.8-FGWkxx7rXiRFDcm3y5XVcs \
ghc-yesod-persistent-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-persistent-2.14.5.0-9uJ7TxdgaWz5Ow6lrik7k2 \
ghc-devel-resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-yesod-core-1.6.24.2-8wK3xEIlG3CBsmvalvvZaH \
ghc-yesod-persistent"

inherit rpm
