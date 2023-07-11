SUMMARY = "Haskell hashtables library development files"
DESCRIPTION = "This package provides the Haskell hashtables library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-hashtables-devel-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "4ef95a898c86f6c35144a45bf46a5ed55e7d33caaa14e8631d76d555ac91f7e88d9976e837193523592522285cedd2d7a127defc9803c805cd403ba876ebe133"

RPROVIDES:${PN} += "ghc-devel-hashtables-1.3.1-AhYwUdJr2hP9YbqppAld0p \
ghc-hashtables-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-hashtables"

inherit rpm
