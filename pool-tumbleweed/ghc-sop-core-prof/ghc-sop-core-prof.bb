SUMMARY = "Haskell sop-core profiling library"
DESCRIPTION = "This package provides the Haskell sop-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-sop-core-prof-0.5.0.2-4.8.aarch64.rpm"
RPM_HASH = "5eae2444e6718a2963b2763d693c0bceeca2623cd837e3d701b8d9db83ae8a5106270e226631fa56470d4965057256cd900ea5a15d4872264e172757bbbb728f"

RPROVIDES:${PN} += "ghc-prof-sop-core-0.5.0.2-4Gqw6OnhbZAJM3BBTi5hGD \
ghc-sop-core-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-sop-core-devel"

inherit rpm
