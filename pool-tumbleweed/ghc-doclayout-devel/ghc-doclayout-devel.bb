SUMMARY = "Haskell doclayout library development files"
DESCRIPTION = "This package provides the Haskell doclayout library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-doclayout-devel-0.4.0.1-1.4.aarch64.rpm"
RPM_HASH = "a0173528c49bfdf87707d777ff95158de1ff8bdaa2855666e5d57f2d53ac7cc7868bc56bb51602b79d53ff5dd2d89e80b7dd8de73168bb2885fcbfa6117ac63a"

RPROVIDES:${PN} += "ghc-devel-doclayout-0.4.0.1-4D8TPYFDHuI6AadIlSPotc \
ghc-doclayout-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-emojis-0.1.3-7wpttN9DVlcBjh9pp4W5jK \
ghc-devel-mtl-2.2.2 \
ghc-devel-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-devel-text-2.0.2 \
ghc-doclayout"

inherit rpm
