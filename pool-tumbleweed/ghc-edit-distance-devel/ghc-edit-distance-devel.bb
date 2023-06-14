SUMMARY = "Haskell edit-distance library development files"
DESCRIPTION = "This package provides the Haskell edit-distance library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-devel-0.2.2.1-13.3.aarch64.rpm"
RPM_HASH = "51c44463dc32094a65d88830630d0a5225b76989b3c500a3213cad8defbd4dffb4af610998b8cefd53d2c387198f5b841f23b4b6df4d522473c5be125e7efabb"

RPROVIDES:${PN} += "ghc-devel-edit-distance-0.2.2.1-6sqaVuKvJlk4f2SjC0p5nu \
ghc-edit-distance-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-edit-distance"

inherit rpm
