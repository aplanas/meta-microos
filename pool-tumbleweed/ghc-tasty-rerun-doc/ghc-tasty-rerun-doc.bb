SUMMARY = "Haskell tasty-rerun library documentation"
DESCRIPTION = "This package provides the Haskell tasty-rerun library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.18"

RPM_NAME = "ghc-tasty-rerun-doc-1.1.18-6.2.noarch.rpm"
RPM_HASH = "a20bc04b4dddb4e19d9f4666a8dbed858ed8051edfc51514da63576c1a75309a7b368a4f629caf1844a49bebd94db94aff5a61cf3774394d932edd949129cc39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-rerun-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
