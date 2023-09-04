SUMMARY = "Haskell dlist library development files"
DESCRIPTION = "This package provides the Haskell dlist library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-devel-1.0-3.3.aarch64.rpm"
RPM_HASH = "70e2fb8814fc34c010a0df386cd34d8467017fb37ecd6b3af34ecd41f20d3ecbe53d3c6867fd997fea0f2ee65aa74caa9f1571ab6d97bfb95bfae3a0291f5ba2"

RPROVIDES:${PN} += "ghc-devel-dlist-1.0-9arrzQ6gBJAKO2k1FjXdTZ \
ghc-dlist-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-dlist"

inherit rpm
