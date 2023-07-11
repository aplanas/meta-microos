SUMMARY = "Haskell indexed-profunctors library development files"
DESCRIPTION = "This package provides the Haskell indexed-profunctors library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-indexed-profunctors-devel-0.1.1.1-1.1.aarch64.rpm"
RPM_HASH = "798bb7f2423fea954c775e2a4f0187e2bec63beb55985fc51b2422f66be09d2bb48faf6c8ef9f21d338eb7a9dd7be12edddbc2de0fc83df27b89014e71a3f2e2"

RPROVIDES:${PN} += "ghc-devel-indexed-profunctors-0.1.1.1-6bLFHbFbToS4H5mdmvIfka \
ghc-indexed-profunctors-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-indexed-profunctors"

inherit rpm
