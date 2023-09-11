SUMMARY = "Haskell pandoc library documentation"
DESCRIPTION = "This package provides the Haskell pandoc library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "ghc-pandoc-doc-3.1.3-2.11.noarch.rpm"
RPM_HASH = "876ff630e032aec6871824905bf4629dc6687e76242e086fd7ba68d399a44dcdca32fabb20464356f51864d83ea9e3f847eed08d17c7beb2d4c7fb1fe1d2ce68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
