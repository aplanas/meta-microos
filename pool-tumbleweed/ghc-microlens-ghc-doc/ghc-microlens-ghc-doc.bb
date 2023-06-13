SUMMARY = "Haskell microlens-ghc library documentation"
DESCRIPTION = "This package provides the Haskell microlens-ghc library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.14.1"

RPM_NAME = "ghc-microlens-ghc-doc-0.4.14.1-2.2.noarch.rpm"
RPM_HASH = "77da3d156f86a0c35be594cd2e778a74412ae8d3ec0b68482ae7441801dd1fc607f1f77f5232aaf323d9fa0072cda082e726c2e6d7479348bde730b573c7f965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-ghc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
