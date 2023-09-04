SUMMARY = "Haskell foldable1-classes-compat profiling library"
DESCRIPTION = "This package provides the Haskell foldable1-classes-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-foldable1-classes-compat-prof-0.1-2.2.aarch64.rpm"
RPM_HASH = "d06325e9ba201a68411407bbba749f9aa74fbd7ffbb225269671face410788a3503ce43a1578867081d983d5810db8746a730641530d92c628d48c7757f12f47"

RPROVIDES:${PN} += "ghc-foldable1-classes-compat-prof \
ghc-prof-foldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy"

RDEPENDS:${PN} += "ghc-foldable1-classes-compat-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-transformers-0.5.6.2"

inherit rpm
