SUMMARY = "Haskell base64 profiling library"
DESCRIPTION = "This package provides the Haskell base64 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.4"

RPM_NAME = "ghc-base64-prof-0.4.2.4-3.3.aarch64.rpm"
RPM_HASH = "828f4a163fc081fbc352e5cc49d82184f1d41de028e3bcb128db5d646a7bfcffe304fc6ba57d657422479131ee24c4232f8dac21b0710617c25d5f8d3d5a422c"

RPROVIDES:${PN} += "ghc-base64-prof \
ghc-prof-base64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV"

RDEPENDS:${PN} += "ghc-base64-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-text-2.0.2 \
ghc-prof-text-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2"

inherit rpm
