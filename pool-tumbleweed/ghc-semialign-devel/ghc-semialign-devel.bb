SUMMARY = "Haskell semialign library development files"
DESCRIPTION = "This package provides the Haskell semialign library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-semialign-devel-1.3-1.3.aarch64.rpm"
RPM_HASH = "2bbfe461e4e0402970470fc88cb3a51e278356267e3bf8bbeb65b00b92cabd74ea5c22e06d8ea124cbbefdf60d9e97d6f0b1c13a90ebf11e44c4894af61dc211"

RPROVIDES:${PN} += "ghc-devel-semialign-1.3-D9a6dNA89ZHcaXKxWN9Am \
ghc-semialign-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-devel-indexed-traversable-instances-0.1.1.2-5OovVMCdJKzAImUo6B0vBJ \
ghc-devel-semigroupoids-5.3.7-Ju2oK8NLhZKHdQ6h8GWNM1 \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-these-1.2-3gvRWs9hjHpLbWG1JfTveA \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-semialign"

inherit rpm
