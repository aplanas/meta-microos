SUMMARY = "Haskell contravariant library documentation"
DESCRIPTION = "This package provides the Haskell contravariant library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.5.5"

RPM_NAME = "ghc-contravariant-doc-1.5.5-2.3.noarch.rpm"
RPM_HASH = "76918646c1a9a61a8a232fc8219297dbac2353bafc278d0bdebfb665ec60e029c1102d877d322b3e009861e8d67b11c6dca0953cbb79d5ce5720bd27797685f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-contravariant-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
