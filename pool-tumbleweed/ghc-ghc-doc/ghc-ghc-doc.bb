SUMMARY = "Haskell ghc library documentation"
DESCRIPTION = "This package provides the Haskell ghc library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-doc-9.4.5-3.2.noarch.rpm"
RPM_HASH = "c8aa9eeaa9b6166f07c76fc48e898b3fac7a494bd18a67543fb04b4e48cad670ae6fdcb31042c25c52d1e3f77ac501f2296974fd28fdf54f1a1a3c97b111748c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
