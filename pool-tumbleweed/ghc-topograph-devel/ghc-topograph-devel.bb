SUMMARY = "Haskell topograph library development files"
DESCRIPTION = "This package provides the Haskell topograph library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.2"

RPM_NAME = "ghc-topograph-devel-1.0.0.2-2.4.aarch64.rpm"
RPM_HASH = "4de0c5afa31bb7416f3d653c76c1b2aa4e8464f7ecbdf3bc485d410de3a6a3131c41be6cbab4ca5e1a37f6a769f1a3be23844626b801c3443fe6a450d24ed39d"

RPROVIDES:${PN} += "ghc-devel-topograph-1.0.0.2-5YRiUwFEAtYF8P5cpJe97E \
ghc-topograph-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1 \
ghc-devel-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-devel-containers-0.6.7 \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-topograph"

inherit rpm
