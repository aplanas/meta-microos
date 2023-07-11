SUMMARY = "Haskell digest profiling library"
DESCRIPTION = "This package provides the Haskell digest profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.0.1.7"

RPM_NAME = "ghc-digest-prof-0.0.1.7-1.6.aarch64.rpm"
RPM_HASH = "2721a58bdbf06e6c2b97111ba31e6d9fac48515920d8ebb79ea8223fbcc4d7118ff7d33795870cf4aa95a54810874eb596af942d37bbbf4709917f65ce4a7033"

RPROVIDES:${PN} += "ghc-digest-prof \
ghc-prof-digest-0.0.1.7-CCCN8814sFy3HuiyT8t94G"

RDEPENDS:${PN} += "ghc-digest-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0"

inherit rpm
