SUMMARY = "Haskell yesod-persistent profiling library"
DESCRIPTION = "This package provides the Haskell yesod-persistent profiling library."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-prof-1.6.0.8-2.8.aarch64.rpm"
RPM_HASH = "ba7ad2868d8f43024e5e989b5d51a32e17685e0f66af2687cd2eb2da3cf33e31a8e716d8cfd05009bcef24a3037360dd053c8eb7425b0b0664f57bb915abe45f"

RPROVIDES:${PN} += "ghc-prof-yesod-persistent-1.6.0.8-Jui070TDUWhEJxvpNjmjRf \
ghc-yesod-persistent-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-persistent-2.14.5.1-8aZiHAHWity6p3rqRx3MdJ \
ghc-prof-resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-yesod-core-1.6.24.2-7isfGP7hc9NLFaHQAgg8t \
ghc-yesod-persistent-devel"

inherit rpm
