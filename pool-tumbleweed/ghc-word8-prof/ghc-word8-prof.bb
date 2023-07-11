SUMMARY = "Haskell word8 profiling library"
DESCRIPTION = "This package provides the Haskell word8 profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-prof-0.1.3-5.6.aarch64.rpm"
RPM_HASH = "c6c811127da4bebc59a2f6af7af3a9bc82cdd875b2b4259e40de3c6e0ccd6d8a67077eda82700f9bf124d4c5196e160a66811a8e3947f26340916ed3159fbe8c"

RPROVIDES:${PN} += "ghc-prof-word8-0.1.3-9uGjviso2af8K0EP8UmxRD \
ghc-word8-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-word8-devel"

inherit rpm
