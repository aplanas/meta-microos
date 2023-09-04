SUMMARY = "Haskell path-pieces profiling library"
DESCRIPTION = "This package provides the Haskell path-pieces profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-path-pieces-prof-0.2.1-12.3.aarch64.rpm"
RPM_HASH = "34e9b83bf35578ddab7a48b5d0c001f5f7ff901b2eaa52af702413e35d3906242e51b439666be13933966339286d856b72d39f27204f737fc2ade0e42ae4fb54"

RPROVIDES:${PN} += "ghc-path-pieces-prof \
ghc-prof-path-pieces-0.2.1-JEJ6IegDP1FHzqmKWi176n"

RDEPENDS:${PN} += "ghc-path-pieces-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2"

inherit rpm
