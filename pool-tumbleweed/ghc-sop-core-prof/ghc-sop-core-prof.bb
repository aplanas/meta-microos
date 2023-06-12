SUMMARY = "Haskell sop-core profiling library"
DESCRIPTION = "This package provides the Haskell sop-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-sop-core-prof-0.5.0.2-4.3.aarch64.rpm"
RPM_HASH = "058d912a597f757cf863a270489fcaabbc04db1f0a42d0cd82479fe146ba1690001b74cd04e9f8033dfd00cf5cfbdf759c5b888dcd66f41dcb4ad0e71e8aa0be"

RPROVIDES:${PN} += "ghc-prof(sop-core-0.5.0.2-C2iIEVjE1N8Lg8Q4QDHkLe) \
ghc-sop-core-prof \
ghc-sop-core-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-sop-core-devel"

inherit rpm
