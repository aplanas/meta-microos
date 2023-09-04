SUMMARY = "Documentation for GNU Stow"
DESCRIPTION = "Documentation for GNU Stow 2.3.1 in HTML and PDF format."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.1"

RPM_NAME = "stow-doc-2.3.1-1.12.noarch.rpm"
RPM_HASH = "92c348dd76b10d167d98d19b6f5ad8bfea48e2b153fca4103a6909b8fe79345a84c898891878881d14fb5d6f48582917335afcff27f102015ffa3d6ba21e55e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stow-doc"

RDEPENDS:${PN} += "stow"

inherit rpm
