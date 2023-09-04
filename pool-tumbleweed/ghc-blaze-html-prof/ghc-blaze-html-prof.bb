SUMMARY = "Haskell blaze-html profiling library"
DESCRIPTION = "This package provides the Haskell blaze-html profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-prof-0.9.1.2-9.3.aarch64.rpm"
RPM_HASH = "76ab90f456e1c04b270cb2dec74270eb562ae85ec1a371d2043cf2d102ea319117c118e22250ff5861dd4e99b8a874e4257fc0e384e118183bfb968d1b33d02d"

RPROVIDES:${PN} += "ghc-blaze-html-prof \
ghc-prof-blaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX"

RDEPENDS:${PN} += "ghc-blaze-html-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-prof-blaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-text-2.0.2"

inherit rpm
