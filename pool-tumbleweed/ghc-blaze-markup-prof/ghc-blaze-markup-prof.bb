SUMMARY = "Haskell blaze-markup profiling library"
DESCRIPTION = "This package provides the Haskell blaze-markup profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-prof-0.8.2.8-5.6.aarch64.rpm"
RPM_HASH = "f23000524d99dc0d31dbaae5ee41da9f881f34f8ac57120fd3e7c33be96d92b365f1535e75d23c11e0e5b50037e636c3f020663989d4c9c9f179f0fbca241883"

RPROVIDES:${PN} += "ghc-blaze-markup-prof \
ghc-prof-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc"

RDEPENDS:${PN} += "ghc-blaze-markup-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-text-2.0.2"

inherit rpm
