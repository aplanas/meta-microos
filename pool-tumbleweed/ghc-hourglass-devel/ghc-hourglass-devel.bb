SUMMARY = "Haskell hourglass library development files"
DESCRIPTION = "This package provides the Haskell hourglass library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-devel-0.2.12-7.6.aarch64.rpm"
RPM_HASH = "472da94a4285d9ef6905e54f4673b0b031c95f3a6f18db4279a65cbcc8e8b811a16fa5b6232c2a767c1a015467f76ded4ab41c5790ef0ef077482684398cae3f"

RPROVIDES:${PN} += "ghc-devel-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3 \
ghc-hourglass-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-hourglass"

inherit rpm
