SUMMARY = "Haskell assoc library development files"
DESCRIPTION = "This package provides the Haskell assoc library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-assoc-devel-1.1-1.3.aarch64.rpm"
RPM_HASH = "4dd41986684014dcb7782224ceab151f3c84e12c7cb4d2eef31d76fbc002b71417525771c83eb0c6972cd30f0529bf1a6abc5b7b5a20cd895146849bad95083d"

RPROVIDES:${PN} += "ghc-assoc-devel \
ghc-devel-assoc-1.1-H3gdf0Ue1d5sn9822dJ4G"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-assoc \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa"

inherit rpm
