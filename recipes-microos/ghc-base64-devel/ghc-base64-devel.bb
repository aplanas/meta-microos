SUMMARY = "Haskell base64 library development files"
DESCRIPTION = "This package provides the Haskell base64 library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.4"

RPM_NAME = "ghc-base64-devel-0.4.2.4-3.3.aarch64.rpm"
RPM_HASH = "4ead0cb8b575c2815064d8760cd48403578eb859389f5593421098d1d3d099202d346bc42c62a36723de372455fd4cecc56b3eecfb8cff827deffd920d00e969"

RPROVIDES:${PN} += "ghc-base64-devel ghc-base64-devel(aarch-64) ghc-devel(base64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV)"
RDEPENDS:${PN} += "/bin/sh ghc-base64 ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(bytestring-0.11.4.0) ghc-devel(deepseq-1.4.8.0) ghc-devel(text-2.0.2) ghc-devel(text-short-0.1.5-82jy4M6AvoMDwlCMY2Ykx2)"

inherit rpm
