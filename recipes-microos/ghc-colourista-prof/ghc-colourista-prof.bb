SUMMARY = "Haskell colourista profiling library"
DESCRIPTION = "This package provides the Haskell colourista profiling library."
LICENSE = "MPL-2.0"

PV = "0.1.0.2"

RPM_NAME = "ghc-colourista-prof-0.1.0.2-1.3.aarch64.rpm"
RPM_HASH = "a516ca4cbc364335c8819a8983f67ca0a79d2cecf42e029dcfb1a484d782c3a560aadf6b7de8c7d90bb8cbefa2615dba8032a7fce469f975c849056788b0b0c0"

RPROVIDES:${PN} += "ghc-colourista-prof ghc-colourista-prof(aarch-64) ghc-prof(colourista-0.1.0.2-5hJOPOBvzIt9IdOCkudaU3)"
RDEPENDS:${PN} += "ghc-colourista-devel ghc-prof(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(text-2.0.2)"

inherit rpm
