SUMMARY = "Haskell config-ini library development files"
DESCRIPTION = "This package provides the Haskell config-ini library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.6.0"

RPM_NAME = "ghc-config-ini-devel-0.2.6.0-1.2.aarch64.rpm"
RPM_HASH = "de854201b3f6911e7f72e73ffdfe838a12fe30c33dd94e496a6a1806d6e955487ee5ce0c7103ad40414e8245212f4a510416f9289db5bb04c701f6c4c868de75"

RPROVIDES:${PN} += "ghc-config-ini-devel \
ghc-devel-config-ini-0.2.6.0-FZ1GgaSPQSr5D8UkvN7nbq"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-config-ini \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-megaparsec-9.3.1-Lptmv1Cc41nKt1ZYt8kXVr \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E"

inherit rpm
