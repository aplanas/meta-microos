SUMMARY = "Haskell xml-hamlet profiling library"
DESCRIPTION = "This package provides the Haskell xml-hamlet profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-xml-hamlet-prof-0.5.0.2-2.4.aarch64.rpm"
RPM_HASH = "0e28f1b61b82b949a6058e0204055c41c463d4b4d2266546be46e6c0aaf8da0b55498c74a1bec3bfa811285c1e346fa3d42cd4a29a4da9bd2ddd47ddd5414711"

RPROVIDES:${PN} += "ghc-prof-xml-hamlet-0.5.0.2-9plFeNSOBanqhTw6DrwhP \
ghc-xml-hamlet-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-shakespeare-2.0.30-LXYSf7m1ZbEJtMw9DSE6kj \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-xml-conduit-1.9.1.3-JDYavYDcwLN29rDQLTOOon \
ghc-xml-hamlet-devel"

inherit rpm
