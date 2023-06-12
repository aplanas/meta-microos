SUMMARY = "Haskell data-default-instances-old-locale library documentation"
DESCRIPTION = "This package provides the Haskell data-default-instances-old-locale library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-old-locale-doc-0.0.1-11.2.noarch.rpm"
RPM_HASH = "379d90c9e7bb662f66ba360ef4d1526f0e6e31e2fdc94bc79661b13160e3118b3858c9d5fac2a3de8eaef5ebb2f39f6e5fb375d34cdbd585c9905ae56ba8f9bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-default-instances-old-locale-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
