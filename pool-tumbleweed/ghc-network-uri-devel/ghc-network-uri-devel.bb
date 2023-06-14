SUMMARY = "Haskell network-uri library development files"
DESCRIPTION = "This package provides the Haskell network-uri library development files."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-devel-2.6.4.2-2.3.aarch64.rpm"
RPM_HASH = "e84c00e47e0b2e50c1deeacdd47b3116e5f1eb7aab10f89788d474d771ded1db0b67e95fd7761641bc915cec790efe59ee625cea24fd6ba025019afc5fb38bd3"

RPROVIDES:${PN} += "ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-network-uri-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv \
ghc-network-uri"

inherit rpm
