SUMMARY = "Haskell indexed-traversable-instances profiling library"
DESCRIPTION = "This package provides the Haskell indexed-traversable-instances profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.1.1.2"

RPM_NAME = "ghc-indexed-traversable-instances-prof-0.1.1.2-1.3.aarch64.rpm"
RPM_HASH = "22f7c4149614fe4edfe6f39fd7c8be7b1fb0f9b5231d75b9b8205e9c87ea68dfc26b381bcd645f9f312e125b6dc1ba701be2b447b52ffd8223a7f5ced2f287a0"

RPROVIDES:${PN} += "ghc-indexed-traversable-instances-prof \
ghc-prof-indexed-traversable-instances-0.1.1.2-5OovVMCdJKzAImUo6B0vBJ"

RDEPENDS:${PN} += "ghc-indexed-traversable-instances-devel \
ghc-prof-OneTuple-0.4.1.1-Fgk8ylTtnzLBSBvZAI1OoV \
ghc-prof-base-4.17.1.0 \
ghc-prof-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
