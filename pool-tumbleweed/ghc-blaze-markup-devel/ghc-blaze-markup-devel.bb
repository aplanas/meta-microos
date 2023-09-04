SUMMARY = "Haskell blaze-markup library development files"
DESCRIPTION = "This package provides the Haskell blaze-markup library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-devel-0.8.2.8-6.3.aarch64.rpm"
RPM_HASH = "c79a88ebe030364d2fa266d2cc690c8d2c53b2468e76f2df18e18ef13afd8192b6c575ed0e7816dfd7b469277877f4feafc05cfbf4379b26ea27181aa98cc82f"

RPROVIDES:${PN} += "ghc-blaze-markup-devel \
ghc-devel-blaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-blaze-markup \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-text-2.0.2"

inherit rpm
