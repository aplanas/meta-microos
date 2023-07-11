SUMMARY = "Haskell optics-core library development files"
DESCRIPTION = "This package provides the Haskell optics-core library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-optics-core-devel-0.4.1.1-1.2.aarch64.rpm"
RPM_HASH = "4a4339f6ba633764fe7741c4dbb762e7d37723addf126910e398c813ec9f183f7a71eca064851768438c103cfa086a61a4762dfde2184deaddb1d933f6a68dc4"

RPROVIDES:${PN} += "ghc-devel-optics-core-0.4.1.1-JC1QypotRRZA0HNSE7diFW \
ghc-optics-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-indexed-profunctors-0.1.1.1-6bLFHbFbToS4H5mdmvIfka \
ghc-devel-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-devel-transformers-0.5.6.2 \
ghc-optics-core"

inherit rpm
