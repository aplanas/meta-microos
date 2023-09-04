SUMMARY = "Haskell commutative-semigroups profiling library"
DESCRIPTION = "This package provides the Haskell commutative-semigroups profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-commutative-semigroups-prof-0.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "48ef32c7e20b092d23338db54482b5b9e0fa3a55d5974cca6d3ba42a39ec5948fe939b09445f3872c851a2593fcb8b28bf4d29151b828441e39e5ac6ae64ff01"

RPROVIDES:${PN} += "ghc-commutative-semigroups-prof \
ghc-prof-commutative-semigroups-0.1.0.1-FXGRW7J4Pkn3IC4oHvkHyd"

RDEPENDS:${PN} += "ghc-commutative-semigroups-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7"

inherit rpm
