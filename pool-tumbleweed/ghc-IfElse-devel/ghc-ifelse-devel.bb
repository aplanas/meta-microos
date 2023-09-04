SUMMARY = "Haskell IfElse library development files"
DESCRIPTION = "This package provides the Haskell IfElse library development files."
LICENSE = "BSD-2-Clause"

PV = "0.85"

RPM_NAME = "ghc-IfElse-devel-0.85-4.3.aarch64.rpm"
RPM_HASH = "159af0cd8f6d5634157b36b59d6b4b3bb1085a11403643f860ed212aadd1df187fd647fd8e064e4afe898a6b818be86863f917d523182a6620e1d5d717bddb9a"

RPROVIDES:${PN} += "ghc-IfElse-devel \
ghc-devel-IfElse-0.85-2pDYDhNcKvHGxAsencQysh"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-IfElse \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-mtl-2.2.2"

inherit rpm
