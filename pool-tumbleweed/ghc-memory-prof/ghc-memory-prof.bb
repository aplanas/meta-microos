SUMMARY = "Haskell memory profiling library"
DESCRIPTION = "This package provides the Haskell memory profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "ghc-memory-prof-0.18.0-2.3.aarch64.rpm"
RPM_HASH = "a1f255a30fc6c81e420f663677ff479151d6659692668b4acb64d4c2b10c4295c16a45873b23bd9516c43b180a2e88490507bf2d12f109a71a1e4c1001856e93"

RPROVIDES:${PN} += "ghc-memory-prof \
ghc-memory-prof(aarch-64) \
ghc-prof(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL)"

RDEPENDS:${PN} += "ghc-memory-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(basement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(ghc-prim-0.9.0)"

inherit rpm
