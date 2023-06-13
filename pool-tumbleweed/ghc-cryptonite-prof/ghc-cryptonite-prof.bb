SUMMARY = "Haskell cryptonite profiling library"
DESCRIPTION = "This package provides the Haskell cryptonite profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.30"

RPM_NAME = "ghc-cryptonite-prof-0.30-2.3.aarch64.rpm"
RPM_HASH = "5030755b4883fae786c38df3a3003c1b03ff587d5f3d587c4bf3ca898a19e414606133e5186dc343b7c62e4c153f1c3d85e07ebfa591fe8be9b37315097f9de5"

RPROVIDES:${PN} += "ghc-cryptonite-prof \
ghc-cryptonite-prof(aarch-64) \
ghc-prof(cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye)"

RDEPENDS:${PN} += "ghc-cryptonite-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(basement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(ghc-prim-0.9.0) \
ghc-prof(integer-gmp-1.1) \
ghc-prof(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL)"

inherit rpm
