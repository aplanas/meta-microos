SUMMARY = "Haskell time library development files"
DESCRIPTION = "This package provides the Haskell time library development files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-devel-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "4af263b7655c451ed940c3163190c179c377f8856b6f6f34c39c85dcdc190f61a5d22f5cd237f9a291d8d3d750d466c0d00b2b0298c1157f07941f61340a0042"

RPROVIDES:${PN} += "ghc-devel-time-1.12.2 \
ghc-time-devel \
ghc-time-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-time"

inherit rpm
