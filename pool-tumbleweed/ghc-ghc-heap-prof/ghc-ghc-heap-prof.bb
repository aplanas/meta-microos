SUMMARY = "Haskell ghc-heap profiling library"
DESCRIPTION = "This package provides the Haskell ghc-heap profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-heap-prof-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "ebe0b1f212b72e98e1556e1f629ec58f3d6705d46386bcf348fdaa18d93a4e9440f18b5e0797078f65019c9317e1dc5c2dc4b575caf7bcbc889bc6b67013eda7"

RPROVIDES:${PN} += "ghc-ghc-heap-prof \
ghc-prof-ghc-heap-9.4.5"

RDEPENDS:${PN} += "ghc-ghc-heap-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-rts-1.0.2"

inherit rpm
