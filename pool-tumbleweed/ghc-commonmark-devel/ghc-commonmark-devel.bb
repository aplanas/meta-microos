SUMMARY = "Haskell commonmark library development files"
DESCRIPTION = "This package provides the Haskell commonmark library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-commonmark-devel-0.2.3-1.4.aarch64.rpm"
RPM_HASH = "49deb946071dfcbf56bb251ad0a6831cd1bc42da21a12a34fa6a7e6c0841a22eba75da7b10ddd1a2ca61305f912f141e6303016b47eeecfb42c87d34e696acba"

RPROVIDES:${PN} += "ghc-commonmark-devel \
ghc-devel-commonmark-0.2.3-6HyB59I8Umx9O57gNLEHWR"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-commonmark \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unicode-data-0.4.0.1-DXmKFuEq71jAHQO9x7NPr \
ghc-devel-unicode-transforms-0.4.0.1-64QTLPchVoAx7KWqlUk24"

inherit rpm
