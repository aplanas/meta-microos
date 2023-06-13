SUMMARY = "Haskell utility-ht library development files"
DESCRIPTION = "This package provides the Haskell utility-ht library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.16"

RPM_NAME = "ghc-utility-ht-devel-0.0.16-2.3.aarch64.rpm"
RPM_HASH = "b361e8eff6413cb5b926eae2af8c5568403e3ad0726f871081cb0ba57f167293fd4852063cc73a9cd12e0a45765782a59e2174443c6f8a4f9e9d8aff2555247b"

RPROVIDES:${PN} += "ghc-devel(utility-ht-0.0.16-CDN97AfZiejDC1itvZ2hyN) \
ghc-utility-ht-devel \
ghc-utility-ht-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-utility-ht"

inherit rpm
