SUMMARY = "Haskell tasty library documentation"
DESCRIPTION = "This package provides the Haskell tasty library documentation."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "ghc-tasty-doc-1.4.3-2.4.noarch.rpm"
RPM_HASH = "36655101e1e6353fcf8fda0c58313093190b9f337c02a48c7c97b30b55d6ef031007e2d8d2375c0e9d0e540dd83ac20f24e24c9904bd3b88a75294a6ad20c856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
