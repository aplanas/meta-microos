SUMMARY = "Haskell refact profiling library"
DESCRIPTION = "This package provides the Haskell refact profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.2"

RPM_NAME = "ghc-refact-prof-0.3.0.2-4.2.aarch64.rpm"
RPM_HASH = "82e8aa95fec51e85a642e27aa349a0b93f01972c24451119ecb628c068bf69775929d6c4b81134eef3db524df52e3d44235bd8e6a5265d06e54fe3bd4597cafd"

RPROVIDES:${PN} += "ghc-prof(refact-0.3.0.2-4ZnrxSKFCNFLIgjtpZGW26) ghc-refact-prof ghc-refact-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) ghc-refact-devel"

inherit rpm
