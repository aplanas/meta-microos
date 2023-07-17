SUMMARY = "Haskell yesod-persistent library development files"
DESCRIPTION = "This package provides the Haskell yesod-persistent library development \
files."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-devel-1.6.0.8-2.8.aarch64.rpm"
RPM_HASH = "f0567620bcf4a32b61e9214c9d71fc18d82eb7cfeea171a0862aa31197e213aac7ad402e24197129663fba95b64af959a470e00eeda6a0f5d5ffb84b16feae53"

RPROVIDES:${PN} += "ghc-devel-yesod-persistent-1.6.0.8-Jui070TDUWhEJxvpNjmjRf \
ghc-yesod-persistent-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-persistent-2.14.5.1-8aZiHAHWity6p3rqRx3MdJ \
ghc-devel-resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-yesod-core-1.6.24.2-7isfGP7hc9NLFaHQAgg8t \
ghc-yesod-persistent"

inherit rpm
