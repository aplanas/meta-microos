SUMMARY = "Haskell case-insensitive library documentation"
DESCRIPTION = "This package provides the Haskell case-insensitive library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-case-insensitive-doc-1.2.1.0-6.4.noarch.rpm"
RPM_HASH = "c4faee388368cf7808c7c9818e9047b6c80074d81be2dadde036982c634da3a6bca61991f4b2e85a1f3d7aea09bec411b3c1c0e667dbc1189a8db36a3243d5b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-case-insensitive-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
