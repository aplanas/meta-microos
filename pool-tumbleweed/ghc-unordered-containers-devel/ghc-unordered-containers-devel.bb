SUMMARY = "Haskell unordered-containers library development files"
DESCRIPTION = "This package provides the Haskell unordered-containers library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.19.1"

RPM_NAME = "ghc-unordered-containers-devel-0.2.19.1-3.6.aarch64.rpm"
RPM_HASH = "04d760a3e7a4a5795295290d9304fa892d91d11361a833832679f17f2c5d2dbc24288c9ab4b6dd8aaca162f9a68c1355699f2938936dfaf870ec34f2406ff94f"

RPROVIDES:${PN} += "ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-unordered-containers-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-template-haskell-2.19.0.0 \
ghc-unordered-containers"

inherit rpm
