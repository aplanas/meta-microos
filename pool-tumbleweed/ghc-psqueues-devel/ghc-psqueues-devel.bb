SUMMARY = "Haskell psqueues library development files"
DESCRIPTION = "This package provides the Haskell psqueues library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.7.3"

RPM_NAME = "ghc-psqueues-devel-0.2.7.3-2.3.aarch64.rpm"
RPM_HASH = "cf3366b1163573f5f2e74c8c61555369fc441cdc77934346a816168960df85e316568bb5b3eb735f72d59350bfbab8eb7a2799340d53140e6cef17a56c1efcac"

RPROVIDES:${PN} += "ghc-devel(psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O) \
ghc-psqueues-devel \
ghc-psqueues-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(ghc-prim-0.9.0) \
ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-psqueues"

inherit rpm
