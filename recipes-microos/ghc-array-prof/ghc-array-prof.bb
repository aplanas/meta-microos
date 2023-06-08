SUMMARY = "Haskell array profiling library"
DESCRIPTION = "This package provides the Haskell array profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-prof-0.5.4.0-1.1.aarch64.rpm"
RPM_HASH = "56030defd66f148aeb48b2536484238c9f1913a85dda9498a1297b02878985da301a1f8b0f91927e0db64a2a0bbce85655c0a0b5e5c5db2d973a3c96ce66738f"

RPROVIDES:${PN} += "ghc-array-prof ghc-array-prof(aarch-64) ghc-prof(array-0.5.4.0)"
RDEPENDS:${PN} += "ghc-array-devel(aarch-64) ghc-prof(base-4.17.1.0)"

inherit rpm
