SUMMARY = "Haskell magic profiling library"
DESCRIPTION = "This package provides the Haskell magic profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-magic-prof-1.1-4.6.aarch64.rpm"
RPM_HASH = "fbf5bab37602fef4dbf76bd17154cb8079561b0270751ea389cc5ea071a9ffd8358521b4a0f900eba5f1b17b31cf99781560c3a5a90a7ab513592cf1b881e38a"

RPROVIDES:${PN} += "ghc-magic-prof \
ghc-prof-magic-1.1-FZjtT3pxmlr6oRrs4QNuLe"

RDEPENDS:${PN} += "ghc-magic-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
