SUMMARY = "Haskell edit-distance library development files"
DESCRIPTION = "This package provides the Haskell edit-distance library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-devel-0.2.2.1-13.6.aarch64.rpm"
RPM_HASH = "2a95ba7cd143869923c283b887fe8e961d8d4625278de4d6cc1ed70c018389b0a0f99b3befc572f09b7aeb12858a161005099a85546d2b07a488ef3091f29f53"

RPROVIDES:${PN} += "ghc-devel-edit-distance-0.2.2.1-6sqaVuKvJlk4f2SjC0p5nu \
ghc-edit-distance-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-edit-distance"

inherit rpm
