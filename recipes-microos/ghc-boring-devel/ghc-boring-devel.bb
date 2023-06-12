SUMMARY = "Haskell boring library development files"
DESCRIPTION = "This package provides the Haskell boring library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-boring-devel-0.2.1-1.2.aarch64.rpm"
RPM_HASH = "baa2d30d647e871e2c998e5fdcc6c1a15c3275ba7e658ef7d8ddf3a18900e7ecc607b0c97cbf733314daa2eeaecd43d620ef51b0a9e6568e58f1b69a8c5f8c6f"

RPROVIDES:${PN} += "ghc-boring-devel \
ghc-boring-devel(aarch-64) \
ghc-devel(boring-0.2.1-J8lJX6Vz53r2bssyBwOtpl)"
RDEPENDS:${PN} += "/bin/sh \
ghc-boring \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-devel(transformers-0.5.6.2)"

inherit rpm
