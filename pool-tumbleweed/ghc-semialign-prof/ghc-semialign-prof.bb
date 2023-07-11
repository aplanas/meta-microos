SUMMARY = "Haskell semialign profiling library"
DESCRIPTION = "This package provides the Haskell semialign profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-semialign-prof-1.3-1.3.aarch64.rpm"
RPM_HASH = "455e33157b5b38b951b415d7570b5d421de5071f1ffca8d1c3c1929b12781323af63361c2c330a52701c0e4e796bc1d969c431945030cb036f8fbfe9447c6ae4"

RPROVIDES:${PN} += "ghc-prof-semialign-1.3-D9a6dNA89ZHcaXKxWN9Am \
ghc-semialign-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-prof-indexed-traversable-instances-0.1.1.2-5OovVMCdJKzAImUo6B0vBJ \
ghc-prof-semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1 \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-these-1.2-3gvRWs9hjHpLbWG1JfTveA \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-semialign-devel"

inherit rpm
