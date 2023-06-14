SUMMARY = "Haskell indexed-traversable-instances library development files"
DESCRIPTION = "This package provides the Haskell indexed-traversable-instances library \
development files."
LICENSE = "BSD-2-Clause"

PV = "0.1.1.2"

RPM_NAME = "ghc-indexed-traversable-instances-devel-0.1.1.2-1.2.aarch64.rpm"
RPM_HASH = "2790068a53767f642c089d60d794bb9e65d2daacbfe31d6b8bc35031a1b5ba1f3ce1e31473da98e569bebfa6b1dd1ec7428023db45028c4f2357a3d252ac5d3a"

RPROVIDES:${PN} += "ghc-devel-indexed-traversable-instances-0.1.1.2-9bsLKqKio7c19LOJlUsRRO \
ghc-indexed-traversable-instances-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-OneTuple-0.3.1-IKxZBiZNgF5H3QnFEzgDrd \
ghc-devel-base-4.17.1.0 \
ghc-devel-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-indexed-traversable-instances"

inherit rpm
