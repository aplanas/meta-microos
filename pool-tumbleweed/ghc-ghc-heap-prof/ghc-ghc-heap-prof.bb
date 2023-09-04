SUMMARY = "Haskell ghc-heap profiling library"
DESCRIPTION = "This package provides the Haskell ghc-heap profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghc-heap-prof-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "7bf6d2a8c04244a89a1fca1349dd29893abc7246c940800e59b8fb0c4fc40e7db1d10b0b5ae4c06c6e4e8f3661a1a426b5eed4880d10d88e1c453da599ba5e06"

RPROVIDES:${PN} += "ghc-ghc-heap-prof \
ghc-prof-ghc-heap-9.4.6"

RDEPENDS:${PN} += "ghc-ghc-heap-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-rts-1.0.2"

inherit rpm
