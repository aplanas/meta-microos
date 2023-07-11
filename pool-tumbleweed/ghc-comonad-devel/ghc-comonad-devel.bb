SUMMARY = "Haskell comonad library development files"
DESCRIPTION = "This package provides the Haskell comonad library development files."
LICENSE = "BSD-2-Clause"

PV = "5.0.8"

RPM_NAME = "ghc-comonad-devel-5.0.8-3.6.aarch64.rpm"
RPM_HASH = "5e98b7c33d775f82a8dc8e605461d825672a4cb8bb198060b3b480157fe18e559d90a8b540c67e4b50eee9e1a9132d8e999560acfb2d69e3b936df72c3abe262"

RPROVIDES:${PN} += "ghc-comonad-devel \
ghc-devel-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-comonad \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79 \
ghc-devel-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd"

inherit rpm
