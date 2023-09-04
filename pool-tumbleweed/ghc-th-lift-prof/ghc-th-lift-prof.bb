SUMMARY = "Haskell th-lift profiling library"
DESCRIPTION = "This package provides the Haskell th-lift profiling library."
LICENSE = "(BSD-3-Clause | GPL-2.0-only)"

PV = "0.8.4"

RPM_NAME = "ghc-th-lift-prof-0.8.4-1.2.aarch64.rpm"
RPM_HASH = "eb2ab33d5a152dea163c9ba29b17814d8f8a6bfc9f7d64fcbde0b7e93ae98d1a588ae6c2d13c1385ea4af30ccdf72647b754f905f398c749f14db54d0fac7ecc"

RPROVIDES:${PN} += "ghc-prof-th-lift-0.8.4-Hb96g2HGtQyHkKuMt8Wl3a \
ghc-th-lift-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-th-lift-devel"

inherit rpm
