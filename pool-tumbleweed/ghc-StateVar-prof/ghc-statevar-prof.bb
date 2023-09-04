SUMMARY = "Haskell StateVar profiling library"
DESCRIPTION = "This package provides the Haskell StateVar profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-StateVar-prof-1.2.2-2.3.aarch64.rpm"
RPM_HASH = "ddb8ce9ccac1a9d6ad9e9eb393174edefe39372c0895b461406c9f3733ce3d4223d8495be83c68f52ee8b8183c9c5750b0b07dd19d1daabe8373197273b572ab"

RPROVIDES:${PN} += "ghc-StateVar-prof \
ghc-prof-StateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J"

RDEPENDS:${PN} += "ghc-StateVar-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
