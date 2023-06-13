SUMMARY = "Haskell yesod-persistent library development files"
DESCRIPTION = "This package provides the Haskell yesod-persistent library development \
files."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-devel-1.6.0.8-2.4.aarch64.rpm"
RPM_HASH = "03522817ea3346980ab4b824ac6d4c2d0071893701aef77c8fc3a3378285744b98c3c9f5399d41869c8ee8f8c9b94b25ee4fbb0d8f770fef554c813387920172"

RPROVIDES:${PN} += "ghc-devel(yesod-persistent-1.6.0.8-DUd8QtbJfktGowTUT2pCEk) \
ghc-yesod-persistent-devel \
ghc-yesod-persistent-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW) \
ghc-devel(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-devel(persistent-2.14.5.0-52EbT4CA3Ct4CmrnsbaA80) \
ghc-devel(resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW) \
ghc-devel(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(yesod-core-1.6.24.2-DExtrbWuaUvstmq3VZuwG) \
ghc-yesod-persistent"

inherit rpm
