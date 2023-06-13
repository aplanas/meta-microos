SUMMARY = "Haskell parallel profiling library"
DESCRIPTION = "This package provides the Haskell parallel profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.2.2.0"

RPM_NAME = "ghc-parallel-prof-3.2.2.0-12.3.aarch64.rpm"
RPM_HASH = "c44b0cd7d936ecf20f761d9bfa2da17a304818277a0a2dd496d4d410ff492d75b94bf01ae1095b7bd86f339ec8b0314ed12aae76ec5b1f67a1d56ed567746f78"

RPROVIDES:${PN} += "ghc-parallel-prof \
ghc-parallel-prof(aarch-64) \
ghc-prof(parallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr)"

RDEPENDS:${PN} += "ghc-parallel-devel \
ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(ghc-prim-0.9.0)"

inherit rpm
