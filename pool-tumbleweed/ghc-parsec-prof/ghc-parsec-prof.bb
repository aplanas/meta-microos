SUMMARY = "Haskell parsec profiling library"
DESCRIPTION = "This package provides the Haskell parsec profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.1.16.1"

RPM_NAME = "ghc-parsec-prof-3.1.16.1-1.1.aarch64.rpm"
RPM_HASH = "84e7d3ef41fa512de8b30847fbf9ae21983e1d5d8d38840c2937e4e3a6ca8430c479b257f1d6807f0b0a5a39aa0d474aa1b6ce936ca6b59613186a37ba338f61"

RPROVIDES:${PN} += "ghc-parsec-prof \
ghc-prof-parsec-3.1.16.1"

RDEPENDS:${PN} += "ghc-parsec-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
