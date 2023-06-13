SUMMARY = "Haskell polyparse library documentation"
DESCRIPTION = "This package provides the Haskell polyparse library documentation."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-doc-1.13-10.3.noarch.rpm"
RPM_HASH = "a2600acd6a8c55414196bc1117744e2d8c717b12d1163df13935f382e248dbfff0c930c843e4dec3ca8aa375dfc7c0da12f0a407636c59886d5fce28625a8cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-polyparse-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
