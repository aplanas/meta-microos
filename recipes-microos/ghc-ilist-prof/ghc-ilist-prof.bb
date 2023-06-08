SUMMARY = "Haskell ilist profiling library"
DESCRIPTION = "This package provides the Haskell ilist profiling library."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-ilist-prof-0.4.0.1-1.2.aarch64.rpm"
RPM_HASH = "01bc989c5d5f917706afe3cb02defb32acf670feaff77c320f9ace83fa43dc8e3720aa5bc68caaab071cdb964cdad0dca90aadf5b70ecb16656b3e15eb847303"

RPROVIDES:${PN} += "ghc-ilist-prof ghc-ilist-prof(aarch-64) ghc-prof(ilist-0.4.0.1-KsvLIKFcqVNEl2m4LjZZwM)"
RDEPENDS:${PN} += "ghc-ilist-devel ghc-prof(base-4.17.1.0)"

inherit rpm
