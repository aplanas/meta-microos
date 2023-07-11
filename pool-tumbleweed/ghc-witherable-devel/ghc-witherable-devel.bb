SUMMARY = "Haskell witherable library development files"
DESCRIPTION = "This package provides the Haskell witherable library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-witherable-devel-0.4.2-4.3.aarch64.rpm"
RPM_HASH = "e4dc2f9964efd3dc73bd0aea7b4e2af3e4edbd045de4c81c61dfd890513c495e0b274c1f1e96ba4279354810cb7ed61e5a8f6096b6531c6bcce0d534b2616638"

RPROVIDES:${PN} += "ghc-devel-witherable-0.4.2-JTGjjCVsQ4I7ks3qsHWAEH \
ghc-witherable-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-devel-indexed-traversable-instances-0.1.1.2-5OovVMCdJKzAImUo6B0vBJ \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-witherable"

inherit rpm
