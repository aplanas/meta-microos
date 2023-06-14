SUMMARY = "Haskell blaze-markup profiling library"
DESCRIPTION = "This package provides the Haskell blaze-markup profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-prof-0.8.2.8-5.3.aarch64.rpm"
RPM_HASH = "73b46c8df906f06aa5dccaaef6b5cc2b17f012984f31c291178dfedd4e4cf6d91bf61314fa410ae9df0a6a7707399c17d112bf609964844daac49b80918dbeb2"

RPROVIDES:${PN} += "ghc-blaze-markup-prof \
ghc-prof-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc"

RDEPENDS:${PN} += "ghc-blaze-markup-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-text-2.0.2"

inherit rpm
