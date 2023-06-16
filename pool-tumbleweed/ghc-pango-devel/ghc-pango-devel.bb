SUMMARY = "Haskell pango library development files"
DESCRIPTION = "This package provides the Haskell pango library development files."
LICENSE = "LGPL-2.1-only"

PV = "0.13.8.2"

RPM_NAME = "ghc-pango-devel-0.13.8.2-2.3.aarch64.rpm"
RPM_HASH = "f0f8e93d8333597c5814b2cff14959c484f2f1ad28c46d9941de47b5e5487f9a5efadcdfe4dbf5186242e418279deab8ce0add59625d991eee764036c8526db5"

RPROVIDES:${PN} += "ghc-devel-pango-0.13.8.2-AyE0ruIpbddIIASgXg66h2 \
ghc-pango-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-cairo-0.13.8.2-84nOBKgVLz3788JDxxB5om \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-glib-0.13.8.2-DQyux8etmkJKUbOUWF524Z \
ghc-devel-mtl-2.2.2 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-process-1.6.16.0 \
ghc-devel-text-2.0.2 \
ghc-pango \
pkgconfig \
pkgconfig-cairo \
pkgconfig-pango \
pkgconfig-pangocairo"

inherit rpm
