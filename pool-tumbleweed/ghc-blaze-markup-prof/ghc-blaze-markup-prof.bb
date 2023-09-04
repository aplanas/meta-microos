SUMMARY = "Haskell blaze-markup profiling library"
DESCRIPTION = "This package provides the Haskell blaze-markup profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-prof-0.8.2.8-6.3.aarch64.rpm"
RPM_HASH = "6332d18300aabc335739ba318d8aafa205bc4e33a63311ede56923d5325898aee540168e623ee950d8b622ced0165f81b4ec26805d2729fbbe75d95e17315d4b"

RPROVIDES:${PN} += "ghc-blaze-markup-prof \
ghc-prof-blaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9"

RDEPENDS:${PN} += "ghc-blaze-markup-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-text-2.0.2"

inherit rpm
