SUMMARY = "Haskell ghc-boot-th library documentation"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-th-doc-9.4.5-3.2.noarch.rpm"
RPM_HASH = "05da66f965a77d44d522e036fca6ee28564dda84b47f57bac36c850f5d2645a7a59fe8af6e17181184b315e971972eb39000c0fd7954667e884921ecaca0945c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-boot-th-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
