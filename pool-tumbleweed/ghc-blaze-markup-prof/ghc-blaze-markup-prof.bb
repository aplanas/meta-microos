SUMMARY = "Haskell blaze-markup profiling library"
DESCRIPTION = "This package provides the Haskell blaze-markup profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-prof-0.8.2.8-6.1.aarch64.rpm"
RPM_HASH = "a303c951f433a7d2242a8aa7c11ee1775498ad71a03a025d144c3f71ff113c9c2008593d6f06d42b1725233488b98ce3bc99b268b6e7c937d5a6fb0f6e4d757d"

RPROVIDES:${PN} += "ghc-blaze-markup-prof \
ghc-prof-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc"

RDEPENDS:${PN} += "ghc-blaze-markup-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-text-2.0.2"

inherit rpm
