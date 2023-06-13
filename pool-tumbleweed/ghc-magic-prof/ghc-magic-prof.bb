SUMMARY = "Haskell magic profiling library"
DESCRIPTION = "This package provides the Haskell magic profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-magic-prof-1.1-4.3.aarch64.rpm"
RPM_HASH = "4492ec4f53535086b21cb543046cf86f2f54c8ad3bfda0ad361d6f2ffbba88101440496d3fe96d4608193d000598a7770c6a4a0202121ab4f6baa029fec9162d"

RPROVIDES:${PN} += "ghc-magic-prof \
ghc-magic-prof(aarch-64) \
ghc-prof(magic-1.1-FZjtT3pxmlr6oRrs4QNuLe)"

RDEPENDS:${PN} += "ghc-magic-devel \
ghc-prof(base-4.17.1.0)"

inherit rpm
