SUMMARY = "Haskell transformers-compat library development files"
DESCRIPTION = "This package provides the Haskell transformers-compat library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "ghc-transformers-compat-devel-0.7.2-2.6.aarch64.rpm"
RPM_HASH = "7ab99d0e8b6984b962d9ccd5c81ed4e34a0165cd857da845b2dcf43430127f373306168fdf18bcbfadc8fd169635f0f31315d3d5d3c985f34793342d3383fbd9"

RPROVIDES:${PN} += "ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-transformers-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-transformers-compat"

inherit rpm
