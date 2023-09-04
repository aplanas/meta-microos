SUMMARY = "Haskell polyparse library documentation"
DESCRIPTION = "This package provides the Haskell polyparse library documentation."
LICENSE = "LGPL-2.1-only"

PV = "1.13"

RPM_NAME = "ghc-polyparse-doc-1.13-12.3.noarch.rpm"
RPM_HASH = "aae597c3949a4c808b5fa58388d305d5da642c8bfdc76c2ad4e549c4e7988341ae85a0e523b218d524a799be7d4e3d0b6ce6cf64bd985f5a7cea938529b9fddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-polyparse-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
