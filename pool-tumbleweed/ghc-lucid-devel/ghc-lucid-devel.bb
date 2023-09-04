SUMMARY = "Haskell lucid library development files"
DESCRIPTION = "This package provides the Haskell lucid library development files."
LICENSE = "BSD-3-Clause"

PV = "2.11.20230408"

RPM_NAME = "ghc-lucid-devel-2.11.20230408-1.5.aarch64.rpm"
RPM_HASH = "8282c014e6d1b9c3228f9f299045b11f59404841830398cefedd6521da3a86ef31e9496817dd563da8a22491b43d8b220c048337eb662b1b38a202327a0d63f4"

RPROVIDES:${PN} += "ghc-devel-lucid-2.11.20230408-F37ejAzYfNaC9F9tMADx3y \
ghc-lucid-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-mmorph-1.2.0-8vW65Nxa2ivI7uZwSjYXdn \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-lucid"

inherit rpm
