SUMMARY = "Haskell iwlib profiling library"
DESCRIPTION = "This package provides the Haskell iwlib profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-iwlib-prof-0.1.2-2.2.aarch64.rpm"
RPM_HASH = "30f8b01a149088f139177dec4531c31ef73b5febb6e1b4aea3154fb4b92b30e3daf8a65a9faa88817b7ffdda794edfa240bfe0041ac761ed41e86e1fd95d6acf"

RPROVIDES:${PN} += "ghc-iwlib-prof \
ghc-prof-iwlib-0.1.2-1s738Tb3Wf2CvjJviNtWBD"

RDEPENDS:${PN} += "ghc-iwlib-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
