SUMMARY = "Haskell mountpoints profiling library"
DESCRIPTION = "This package provides the Haskell mountpoints profiling library."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-prof-1.0.2-4.4.aarch64.rpm"
RPM_HASH = "f126b69b4477c2c50fe1d01562d1fe76fdc1e070d773204bdb75c02c622930b6ba721bd1e4dab8098b197ec3b88e4e298657523ea495b96e8f8df72a0f4f8e5c"

RPROVIDES:${PN} += "ghc-mountpoints-prof \
ghc-prof-mountpoints-1.0.2-6LGBE5yGg5t52Lw1dci4Pp"

RDEPENDS:${PN} += "ghc-mountpoints-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
