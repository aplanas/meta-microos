SUMMARY = "Haskell array library development files"
DESCRIPTION = "This package provides the Haskell array library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-devel-0.5.4.0-3.2.aarch64.rpm"
RPM_HASH = "906c57faf7e612e4fc12530b2ae395173454a11ab3463df654c57d28acf6c983420c9802ceed7105caa631d6af6294544a0fc9a9038b3ffd392593f6764a1241"

RPROVIDES:${PN} += "ghc-array-devel \
ghc-array-static \
ghc-devel-array-0.5.4.0"

RDEPENDS:${PN} += "ghc-array \
ghc-compiler \
ghc-devel-base-4.17.1.0"

inherit rpm
