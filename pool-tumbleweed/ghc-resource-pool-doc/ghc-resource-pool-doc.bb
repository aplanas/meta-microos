SUMMARY = "Haskell resource-pool library documentation"
DESCRIPTION = "This package provides the Haskell resource-pool library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-resource-pool-doc-0.4.0.0-2.3.noarch.rpm"
RPM_HASH = "2cc5133c4293b9ab12f71a96281712f649e81e42bbad2923d3b3b2d4039c584b14c60a3337952782e78bc29beff168191850d89e5745b904ac374b8fcf939baa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-resource-pool-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
