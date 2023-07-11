SUMMARY = "Haskell config-ini profiling library"
DESCRIPTION = "This package provides the Haskell config-ini profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.6.0"

RPM_NAME = "ghc-config-ini-prof-0.2.6.0-1.2.aarch64.rpm"
RPM_HASH = "d8171a6f6d99fd939bad685e407da5204eb5731a741817c2e8f953ba8539f5da782914f8842758995902c1566d42d7443b11725aef15be14a849ad793e8e9a21"

RPROVIDES:${PN} += "ghc-config-ini-prof \
ghc-prof-config-ini-0.2.6.0-FZ1GgaSPQSr5D8UkvN7nbq"

RDEPENDS:${PN} += "ghc-config-ini-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-megaparsec-9.3.1-Lptmv1Cc41nKt1ZYt8kXVr \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E"

inherit rpm
