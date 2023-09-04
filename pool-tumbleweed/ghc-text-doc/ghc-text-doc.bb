SUMMARY = "Haskell text library documentation"
DESCRIPTION = "This package provides the Haskell text library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "ghc-text-doc-2.0.2-1.1.noarch.rpm"
RPM_HASH = "1bda77e7c1f87d7d73f55a7c2f22dfc08b1a311b0614e717610dde85f3b15b6100cb9fe7b969d21fe0688fdab54f248f99d82db062cd7eafa9cfe21e746df69a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
