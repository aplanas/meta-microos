SUMMARY = "Haskell libyaml library development files"
DESCRIPTION = "This package provides the Haskell libyaml library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-libyaml-devel-0.1.2-6.3.aarch64.rpm"
RPM_HASH = "4c574171af2f934a29a05586ed83fc8e02d35178b1d714c20fff0c0eb4b053a3f9f72d4c5e380d037514b52d261fcf5c7774154b10cac623dc63d448e735fc0a"

RPROVIDES:${PN} += "ghc-devel(libyaml-0.1.2-HGo47aMnIYAKZUBwKE0axw) \
ghc-libyaml-devel \
ghc-libyaml-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-devel(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) \
ghc-libyaml \
libyaml-devel"

inherit rpm
