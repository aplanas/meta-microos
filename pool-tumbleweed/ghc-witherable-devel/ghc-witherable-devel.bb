SUMMARY = "Haskell witherable library development files"
DESCRIPTION = "This package provides the Haskell witherable library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-witherable-devel-0.4.2-4.2.aarch64.rpm"
RPM_HASH = "a2716eead68fcc4129f32e49b27fb4e7c3e9f0e39eea5292dcf009de347d175c5d86e5ddbde7a6ba1d666c9868d58a4e5a9d66355d6cc0dcd3f5a1430cfdf68a"

RPROVIDES:${PN} += "ghc-devel-witherable-0.4.2-3r5H0uqg5SQLafbMfCHwUh \
ghc-witherable-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-devel-indexed-traversable-instances-0.1.1.2-9bsLKqKio7c19LOJlUsRRO \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-witherable"

inherit rpm
