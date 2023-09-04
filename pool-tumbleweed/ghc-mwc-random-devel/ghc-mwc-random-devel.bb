SUMMARY = "Haskell mwc-random library development files"
DESCRIPTION = "This package provides the Haskell mwc-random library development files."
LICENSE = "BSD-2-Clause"

PV = "0.15.0.2"

RPM_NAME = "ghc-mwc-random-devel-0.15.0.2-3.8.aarch64.rpm"
RPM_HASH = "1feefb6bea19829471e0f29a445754500c83066ceae20bd83bdfcc45ef38d4b8976fd21a07dd8c00874ef9c1f9537a14626246bc44474b8a0088d2141d8e29f4"

RPROVIDES:${PN} += "ghc-devel-mwc-random-0.15.0.2-9nri7BsVv5CBC89QkshOkp \
ghc-mwc-random-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-math-functions-0.3.4.2-Ke5dPSL1fMD1KAZhy38VGR \
ghc-devel-primitive-0.7.4.0-F2Mc1OnmlS8GBXxA9I0mgx \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-time-1.12.2 \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-mwc-random"

inherit rpm
