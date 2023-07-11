SUMMARY = "Haskell fgl library development files"
DESCRIPTION = "This package provides the Haskell fgl library development files."
LICENSE = "BSD-3-Clause"

PV = "5.8.0.0"

RPM_NAME = "ghc-fgl-devel-5.8.0.0-3.2.aarch64.rpm"
RPM_HASH = "cad64c2d2d181a04386cfa74236f239079eda4e14bfa988075d1ae4aad7917c71fd014d6a31a615d5af5dc13cf646ed900da2a558cf11974ece3fc0a2e00b7aa"

RPROVIDES:${PN} += "ghc-devel-fgl-5.8.0.0-1euDADByC3LGFbnFGelVpn \
ghc-fgl-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-fgl"

inherit rpm
