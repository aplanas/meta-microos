SUMMARY = "Haskell hourglass profiling library"
DESCRIPTION = "This package provides the Haskell hourglass profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-prof-0.2.12-7.6.aarch64.rpm"
RPM_HASH = "5d28836aa76094819737fcf4823445320760f1e8e4dbdba501c37540edd364aa0aee5928a9ab1650845126ccfbbb83e4b197303a6e70b114ff15ad9959c89e9a"

RPROVIDES:${PN} += "ghc-hourglass-prof \
ghc-prof-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3"

RDEPENDS:${PN} += "ghc-hourglass-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0"

inherit rpm
