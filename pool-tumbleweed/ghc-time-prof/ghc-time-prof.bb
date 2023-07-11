SUMMARY = "Haskell time profiling library"
DESCRIPTION = "This package provides the Haskell time profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-prof-1.12.2-3.2.aarch64.rpm"
RPM_HASH = "d5cd012af88bd9dc83d28b2307f1ee16d8cbf4bdcaad5f61534a0cd171ae609d99689cf2863e6fa2bf5d785caf6bc71f83600e44bef3ad54ef5a09deb030763a"

RPROVIDES:${PN} += "ghc-prof-time-1.12.2 \
ghc-time-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-time-devel"

inherit rpm
