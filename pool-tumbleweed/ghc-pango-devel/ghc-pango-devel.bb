SUMMARY = "Haskell pango library development files"
DESCRIPTION = "This package provides the Haskell pango library development files."
LICENSE = "LGPL-2.1-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-pango-devel-0.13.10.0-1.6.aarch64.rpm"
RPM_HASH = "45fee4800b98f72148f319d9c1753e922c672a81207c4a71fc33d58b75785bfa12c3e1d4015046d5d294378df32a7f1d4524062f6f1b0789315023d360fb221d"

RPROVIDES:${PN} += "ghc-devel-pango-0.13.10.0-FM47W5PFqW5BGqK9yscE4O \
ghc-pango-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-cairo-0.13.10.0-B3UP0Vi5jIV99bUcWUsXgu \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-glib-0.13.10.0-FwtjszetdFF6KErN1CKeSg \
ghc-devel-mtl-2.2.2 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-process-1.6.17.0 \
ghc-devel-text-2.0.2 \
ghc-pango \
pkgconfig \
pkgconfig-cairo \
pkgconfig-pango \
pkgconfig-pangocairo"

inherit rpm
