SUMMARY = "Haskell sop-core profiling library"
DESCRIPTION = "This package provides the Haskell sop-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-sop-core-prof-0.5.0.2-4.6.aarch64.rpm"
RPM_HASH = "fe477856778bf1b0b27e3fe4cb4eb52c83b8d2731567f862d577f60cb26b4eab279ce07a218326f03c8480ac52c5486793eb654bb1020c2a0b362050a3fa2eee"

RPROVIDES:${PN} += "ghc-prof-sop-core-0.5.0.2-C2iIEVjE1N8Lg8Q4QDHkLe \
ghc-sop-core-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-sop-core-devel"

inherit rpm
