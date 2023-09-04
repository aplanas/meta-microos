SUMMARY = "Haskell word-wrap library development files"
DESCRIPTION = "This package provides the Haskell word-wrap library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-word-wrap-devel-0.5-2.3.aarch64.rpm"
RPM_HASH = "b413f3d852b19a89026de8ac8788ace5193ba4cca5a374cd4ae08b122f94246d40845ad696498838118f59516c8221b68330768e05f58ef8dde14a1811f5a3d3"

RPROVIDES:${PN} += "ghc-devel-word-wrap-0.5-6mKx5HwYguB2E3kl2rrPmY \
ghc-word-wrap-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-text-2.0.2 \
ghc-word-wrap"

inherit rpm
