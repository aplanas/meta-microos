SUMMARY = "Haskell lift-type library development files"
DESCRIPTION = "This package provides the Haskell lift-type library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-lift-type-devel-0.1.1.1-2.3.aarch64.rpm"
RPM_HASH = "48f01dcf024d594e71bf0070d9a1ed74b0924a1e77330a89ac9a8c9478956b5b65c2d58a1fd98494810aead410487927694cff8c91c2b38d358dbc7347e8f8f8"

RPROVIDES:${PN} += "ghc-devel-lift-type-0.1.1.1-4CMQtv7szwz8L9BvxxqTk1 \
ghc-lift-type-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-lift-type"

inherit rpm
