SUMMARY = "Haskell network profiling library"
DESCRIPTION = "This package provides the Haskell network profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.1.4.0"

RPM_NAME = "ghc-network-prof-3.1.4.0-1.3.aarch64.rpm"
RPM_HASH = "30a9f5efe81854a58ebfdfde5c12e4cd08abd57efbef929a74b800b3bec2f88a1480fdcdbeb42dd47be9a806f41dee42d5b8ba87197bfee21d4e8fefd13b5832"

RPROVIDES:${PN} += "ghc-network-prof \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc"

RDEPENDS:${PN} += "ghc-network-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1"

inherit rpm
