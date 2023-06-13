SUMMARY = "Haskell criterion-measurement profiling library"
DESCRIPTION = "This package provides the Haskell criterion-measurement profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.0"

RPM_NAME = "ghc-criterion-measurement-prof-0.2.1.0-1.2.aarch64.rpm"
RPM_HASH = "9f9cfca6dab05bf92992e236052a0cccb13804c9e546435e04202914441362f07f782b7cd9d140aebb65b1c7885c8339eac8ad61df470cb32cbd24529d7db80f"

RPROVIDES:${PN} += "ghc-criterion-measurement-prof \
ghc-criterion-measurement-prof(aarch-64) \
ghc-prof(criterion-measurement-0.2.1.0-87nlGOXoqxrBN5mUt0bPv1)"

RDEPENDS:${PN} += "ghc-criterion-measurement-devel \
ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(base-4.17.1.0) \
ghc-prof(base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov) \
ghc-prof(binary-0.8.9.1) \
ghc-prof(containers-0.6.7) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(ghc-prim-0.9.0) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
