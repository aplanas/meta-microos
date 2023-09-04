SUMMARY = "Haskell base-compat library development files"
DESCRIPTION = "This package provides the Haskell base-compat library development files."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "ghc-base-compat-devel-0.13.0-1.5.aarch64.rpm"
RPM_HASH = "523c848036aa2ae8ae43cd3a85ae04733371679af126458c84f83610b90dc6c4d0f4a4c1f81009b2976e848fe8d5c824b27628cf1b7f1b120d46a58a910ba3db"

RPROVIDES:${PN} += "ghc-base-compat-devel \
ghc-devel-base-compat-0.13.0-ASw4phAd2I0LrTJ4o8lXb1"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base-compat \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-unix-2.7.3"

inherit rpm
