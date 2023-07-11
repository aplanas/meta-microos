SUMMARY = "Haskell securemem profiling library"
DESCRIPTION = "This package provides the Haskell securemem profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-prof-0.1.10-4.4.aarch64.rpm"
RPM_HASH = "83b9b35580e56769b69e2b2e7086419b8f9e463ececc9432def5bd1bd955efbec0c3da4a92dca1d162894aef44e50b50b290bc2e49b00262a90a9f7516cd4fd5"

RPROVIDES:${PN} += "ghc-prof-securemem-0.1.10-14D6arGPELi9Mzd7V4Fyfu \
ghc-securemem-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-securemem-devel"

inherit rpm
