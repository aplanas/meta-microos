SUMMARY = "Haskell psqueues library development files"
DESCRIPTION = "This package provides the Haskell psqueues library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.7.3"

RPM_NAME = "ghc-psqueues-devel-0.2.7.3-2.6.aarch64.rpm"
RPM_HASH = "1ca87703e6651340a19c45a6ae4029ed8e0307c9c945bbbd3df5637aae8dee642c34d2ce97776809c89150825a6bf2ba0c095b02fb7cd4bf8e9c9eb1cb51fc0c"

RPROVIDES:${PN} += "ghc-devel-psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O \
ghc-psqueues-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-psqueues"

inherit rpm
