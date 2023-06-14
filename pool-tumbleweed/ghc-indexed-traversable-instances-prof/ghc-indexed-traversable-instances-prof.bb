SUMMARY = "Haskell indexed-traversable-instances profiling library"
DESCRIPTION = "This package provides the Haskell indexed-traversable-instances profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.1.2"

RPM_NAME = "ghc-indexed-traversable-instances-prof-0.1.1.2-1.2.aarch64.rpm"
RPM_HASH = "aca444e262efa037fbb409413d784bbb1197ece174deee20f9971695f7342a416ca6aac86d94d490ba17d54abef62b9eb5107fa232992f30fe20de17c9cec0a9"

RPROVIDES:${PN} += "ghc-indexed-traversable-instances-prof \
ghc-prof-indexed-traversable-instances-0.1.1.2-9bsLKqKio7c19LOJlUsRRO"

RDEPENDS:${PN} += "ghc-indexed-traversable-instances-devel \
ghc-prof-OneTuple-0.3.1-IKxZBiZNgF5H3QnFEzgDrd \
ghc-prof-base-4.17.1.0 \
ghc-prof-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
