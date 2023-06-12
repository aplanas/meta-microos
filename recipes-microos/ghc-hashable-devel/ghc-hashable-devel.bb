SUMMARY = "Haskell hashable library development files"
DESCRIPTION = "This package provides the Haskell hashable library development files."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.0"

RPM_NAME = "ghc-hashable-devel-1.4.2.0-1.3.aarch64.rpm"
RPM_HASH = "73e86d3b09d22064dcbe4122e04ce3fb353ed73669a86f63cab810a6aab4271e4a0666d661a2f94257699f0baee8d8529adb3f3df7c6532f6d37b3d3823b40c5"

RPROVIDES:${PN} += "ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-hashable-devel \
ghc-hashable-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(ghc-bignum-1.3) \
ghc-devel(ghc-prim-0.9.0) \
ghc-devel(text-2.0.2) \
ghc-hashable"

inherit rpm
