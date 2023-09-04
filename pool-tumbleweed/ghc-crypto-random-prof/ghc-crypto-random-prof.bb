SUMMARY = "Haskell crypto-random profiling library"
DESCRIPTION = "This package provides the Haskell crypto-random profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-random-prof-0.0.9-6.3.aarch64.rpm"
RPM_HASH = "20e386d08b1732bee5680fb0f60936d8afd601e641788a47f236f0ae45194f7eb224614dd1382a178a0c197776b3e7076937c9daa56a108293ade6a792eaec2a"

RPROVIDES:${PN} += "ghc-crypto-random-prof \
ghc-prof-crypto-random-0.0.9-EARwXMpyWawUPhdi0weks"

RDEPENDS:${PN} += "ghc-crypto-random-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-securemem-0.1.10-HwgHwfqNrQFCVsnPOu3Pz4 \
ghc-prof-unix-2.7.3 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
