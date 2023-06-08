SUMMARY = "Haskell regex-compat profiling library"
DESCRIPTION = "This package provides the Haskell regex-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.95.2.1"

RPM_NAME = "ghc-regex-compat-prof-0.95.2.1-4.2.aarch64.rpm"
RPM_HASH = "fbd25af7f4d34c8908b93f8c166b773125dcd3d2f049a8273f35c7bc9ccbec7f358afcd199a1c0a4851a107571d478fba7b11da6a688c0a105862daaf718ebb0"

RPROVIDES:${PN} += "ghc-prof(regex-compat-0.95.2.1-9I4JwtnoxVY9Cu5lIL0XLJ) ghc-regex-compat-prof ghc-regex-compat-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq) ghc-prof(regex-posix-0.96.0.1-Db56rsDUom23lFxliY5wt1) ghc-regex-compat-devel"

inherit rpm
