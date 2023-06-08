SUMMARY = "Haskell cryptonite-conduit profiling library"
DESCRIPTION = "This package provides the Haskell cryptonite-conduit profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-cryptonite-conduit-prof-0.2.2-9.3.aarch64.rpm"
RPM_HASH = "1333dee69c3aa15b92a1c051494df43f33ace70389b34bba20df4f66c3175f86b53d3cfc494eb5e02e7c90ebe904c50e1827081f51d6d2caa64a36c11c127301"

RPROVIDES:${PN} += "ghc-cryptonite-conduit-prof ghc-cryptonite-conduit-prof(aarch-64) ghc-prof(cryptonite-conduit-0.2.2-Ic5yZAN3MwnLmQgFse4azZ)"
RDEPENDS:${PN} += "ghc-cryptonite-conduit-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) ghc-prof(conduit-extra-1.3.6-F6u9UYzIZvy2L2764Izuhr) ghc-prof(cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye) ghc-prof(exceptions-0.10.5) ghc-prof(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) ghc-prof(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) ghc-prof(transformers-0.5.6.2)"

inherit rpm
