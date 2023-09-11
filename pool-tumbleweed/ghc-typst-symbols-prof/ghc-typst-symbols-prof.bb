SUMMARY = "Haskell typst-symbols profiling library"
DESCRIPTION = "This package provides the Haskell typst-symbols profiling library."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "ghc-typst-symbols-prof-0.1.4-1.1.aarch64.rpm"
RPM_HASH = "f28c45a98a261852392b1dc1e9c930d82395e83f5065e4c89ac5469d750eba3715c88cec1d55125c47e108b273b287a73c64d23db3f83d3807c6ebf8e4b9a27c"

RPROVIDES:${PN} += "ghc-prof-typst-symbols-0.1.4-JaoP2leChnCACsgYhrK1kO \
ghc-typst-symbols-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-text-2.0.2 \
ghc-typst-symbols-devel"

inherit rpm
