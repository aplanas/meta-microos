SUMMARY = "Haskell alsa-core profiling library"
DESCRIPTION = "This package provides the Haskell alsa-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-prof-0.5.0.1-4.4.aarch64.rpm"
RPM_HASH = "a7403e678152b161ed490ee1c8ad66cc8eb6519b2d2a2945b5a8c6327b10a8f169d0fa213d2ca322d368b07157b93fb1014e2edca89e450e24f4b452a9203ed8"

RPROVIDES:${PN} += "ghc-alsa-core-prof \
ghc-prof-alsa-core-0.5.0.1-5CJfdeELTf160s2ftizQdy"

RDEPENDS:${PN} += "ghc-alsa-core-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-extensible-exceptions-0.1.1.4-1hcTiYLx0LbAr3mhUvVP0e"

inherit rpm
