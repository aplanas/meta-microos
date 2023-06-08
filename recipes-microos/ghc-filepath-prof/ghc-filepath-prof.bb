SUMMARY = "Haskell filepath profiling library"
DESCRIPTION = "This package provides the Haskell filepath profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.2"

RPM_NAME = "ghc-filepath-prof-1.4.2.2-1.1.aarch64.rpm"
RPM_HASH = "d9b85b1cde0853f5233000c79aa6d3c6a113a647230381bd5ecd43c177dc594d71302b5e72829c0dd7261fffe31ddc5a9cd38724b9cd0fc4cb620fed99af1cd3"

RPROVIDES:${PN} += "ghc-filepath-prof ghc-filepath-prof(aarch-64) ghc-prof(filepath-1.4.2.2)"
RDEPENDS:${PN} += "ghc-filepath-devel(aarch-64) ghc-prof(base-4.17.1.0)"

inherit rpm
