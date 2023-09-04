SUMMARY = "Haskell edit-distance profiling library"
DESCRIPTION = "This package provides the Haskell edit-distance profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-prof-0.2.2.1-13.8.aarch64.rpm"
RPM_HASH = "0820dad59a3721b5d7b8bb3315d10c1d0ff4234582f5ed016476f7ddc1d487b57a0d50cdfb65336e98f6d3f3dd802be3ff3925eb6296fa6e94de3dd38d362ef3"

RPROVIDES:${PN} += "ghc-edit-distance-prof \
ghc-prof-edit-distance-0.2.2.1-ITBK6JvlsOE36MkOzN30LX"

RDEPENDS:${PN} += "ghc-edit-distance-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k"

inherit rpm
