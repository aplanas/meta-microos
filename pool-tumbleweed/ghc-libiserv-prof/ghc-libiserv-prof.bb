SUMMARY = "Haskell libiserv profiling library"
DESCRIPTION = "This package provides the Haskell libiserv profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-libiserv-prof-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "3045f4e286f54a3ce95d20a27eac23648ce5720a84709230371f71fa44932d89385560bbc921421ba8a5cedfc3bd5ac4d7e77f3f170e9c8c15d1b2e963647dd6"

RPROVIDES:${PN} += "ghc-libiserv-prof \
ghc-prof-libiserv-9.4.5"

RDEPENDS:${PN} += "ghc-libiserv-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghci-9.4.5 \
ghc-prof-unix-2.7.3"

inherit rpm
