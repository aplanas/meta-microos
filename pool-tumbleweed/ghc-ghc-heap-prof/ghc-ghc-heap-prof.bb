SUMMARY = "Haskell ghc-heap profiling library"
DESCRIPTION = "This package provides the Haskell ghc-heap profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-heap-prof-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "6f2d4034fc18da96041706401c924b3f9ac3bee2178f4acb0414a369055ba863309ccd61673074f401808f27c770f426a97fd3436f3741f65fcdecc1bd7ab9b0"

RPROVIDES:${PN} += "ghc-ghc-heap-prof \
ghc-prof-ghc-heap-9.4.5"

RDEPENDS:${PN} += "ghc-ghc-heap-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-rts-1.0.2"

inherit rpm
