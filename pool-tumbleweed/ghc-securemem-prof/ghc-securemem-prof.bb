SUMMARY = "Haskell securemem profiling library"
DESCRIPTION = "This package provides the Haskell securemem profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-prof-0.1.10-4.5.aarch64.rpm"
RPM_HASH = "6d1b64bfb5ad38f59b034022f8764e7671e7ed4049432804663102d93d1d760a4f53cb0afa6c58560677b0010dd77097e96b0d6044ab154961f0efe015be18e7"

RPROVIDES:${PN} += "ghc-prof-securemem-0.1.10-HwgHwfqNrQFCVsnPOu3Pz4 \
ghc-securemem-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-securemem-devel"

inherit rpm
