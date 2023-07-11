SUMMARY = "Haskell libyaml library development files"
DESCRIPTION = "This package provides the Haskell libyaml library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-libyaml-devel-0.1.2-6.7.aarch64.rpm"
RPM_HASH = "9d07013bef8564df37ec039355caa1fd64189fa759d67359e11cdd158fb6205c30a7170e4d23794cc4db1ecd7acfc006f9c07a34b6b67f9f3b5fa4dd6941619d"

RPROVIDES:${PN} += "ghc-devel-libyaml-0.1.2-6Gx0z1LjMeG6dZCnkkkmHj \
ghc-libyaml-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-libyaml \
libyaml-devel"

inherit rpm
