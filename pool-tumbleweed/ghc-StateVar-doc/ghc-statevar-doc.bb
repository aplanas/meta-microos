SUMMARY = "Haskell StateVar library documentation"
DESCRIPTION = "This package provides the Haskell StateVar library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-StateVar-doc-1.2.2-2.2.noarch.rpm"
RPM_HASH = "f2d1383265c602aee4110bf19c07f90cddba11fefc0e45da500cf045268425c2d23bc10b5604f375a363e946e37f1690b84e38f5e843f9bbf60b9db62b6d1d6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-StateVar-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
