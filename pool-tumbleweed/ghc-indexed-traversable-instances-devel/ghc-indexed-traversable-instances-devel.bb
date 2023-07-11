SUMMARY = "Haskell indexed-traversable-instances library development files"
DESCRIPTION = "This package provides the Haskell indexed-traversable-instances library \
development files."
LICENSE = "BSD-2-Clause"

PV = "0.1.1.2"

RPM_NAME = "ghc-indexed-traversable-instances-devel-0.1.1.2-1.3.aarch64.rpm"
RPM_HASH = "55dd93746f577320a9fec0ca9c7f62e0903772cbe7466ad8d5a8da184482c406a49176e4988c6ad9bdd33eb664ba9ad23c1ee39c95dcbace0bee0f9a5c5c8611"

RPROVIDES:${PN} += "ghc-devel-indexed-traversable-instances-0.1.1.2-5OovVMCdJKzAImUo6B0vBJ \
ghc-indexed-traversable-instances-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-OneTuple-0.4.1.1-Fgk8ylTtnzLBSBvZAI1OoV \
ghc-devel-base-4.17.1.0 \
ghc-devel-indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-indexed-traversable-instances"

inherit rpm
