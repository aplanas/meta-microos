SUMMARY = "Haskell pango library development files"
DESCRIPTION = "This package provides the Haskell pango library development files."
LICENSE = "LGPL-2.1-only"

PV = "0.13.10.0"

RPM_NAME = "ghc-pango-devel-0.13.10.0-1.3.aarch64.rpm"
RPM_HASH = "01349f0a8cab07a5d92a7849398df9915cc163df38595310a62d49222bf2f5422658dfba1a42a45d6454e5df9e299bc68fffa02bff3fff7f6cab650630670ef4"

RPROVIDES:${PN} += "ghc-devel-pango-0.13.10.0-Es56i1Q8thp2nfdEwUTWXD \
ghc-pango-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-cairo-0.13.10.0-79KHEyza8Yx2ITjvRp5k2b \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-glib-0.13.10.0-3OTFLQKlfVK7JIaqsLt0K \
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
