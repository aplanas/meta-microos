SUMMARY = "Haskell parallel profiling library"
DESCRIPTION = "This package provides the Haskell parallel profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.2.2.0"

RPM_NAME = "ghc-parallel-prof-3.2.2.0-12.8.aarch64.rpm"
RPM_HASH = "53e46206d6beed35906be0bfd39c0c6584e0e20c2e72252d5b6c3bb695bcc57c394429f5a52c9c1f68ae719023b09ffb0ac236fdbfd5e2c4fa8372caf32b13c2"

RPROVIDES:${PN} += "ghc-parallel-prof \
ghc-prof-parallel-3.2.2.0-4HmomK1BnRHCRUDqhNxOgQ"

RDEPENDS:${PN} += "ghc-parallel-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1"

inherit rpm
