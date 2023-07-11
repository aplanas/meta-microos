SUMMARY = "Haskell witherable profiling library"
DESCRIPTION = "This package provides the Haskell witherable profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-witherable-prof-0.4.2-4.3.aarch64.rpm"
RPM_HASH = "c660c588d63ec13d0dd8a42cd7d946f37f0cabc29bc5c1367a05f77014a4f05dbc83ce87521f40f30484bb34fceabfc2a0963e3863298184aa8f50f126f7099a"

RPROVIDES:${PN} += "ghc-prof-witherable-0.4.2-JTGjjCVsQ4I7ks3qsHWAEH \
ghc-witherable-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8 \
ghc-prof-containers-0.6.7 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-prof-indexed-traversable-instances-0.1.1.2-5OovVMCdJKzAImUo6B0vBJ \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-witherable-devel"

inherit rpm
