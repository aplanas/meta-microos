SUMMARY = "Haskell cryptonite profiling library"
DESCRIPTION = "This package provides the Haskell cryptonite profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.30"

RPM_NAME = "ghc-cryptonite-prof-0.30-2.6.aarch64.rpm"
RPM_HASH = "8ae15753d654afbbdbb8e6ffb3a049e1552a088cc57c43894c5d44e55226bf2c8bc610731a50fe854dafcd6e0de53ec8dc692773d78ed44b9744f72e95650def"

RPROVIDES:${PN} += "ghc-cryptonite-prof \
ghc-prof-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ"

RDEPENDS:${PN} += "ghc-cryptonite-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-integer-gmp-1.1 \
ghc-prof-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp"

inherit rpm
