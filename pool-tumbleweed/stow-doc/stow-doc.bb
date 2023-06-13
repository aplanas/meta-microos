SUMMARY = "Documentation for GNU Stow"
DESCRIPTION = "Documentation for GNU Stow 2.3.1 in HTML and PDF format."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.1"

RPM_NAME = "stow-doc-2.3.1-1.10.noarch.rpm"
RPM_HASH = "97c68d8acc6b877185be6cd1f695dc50f3eb5a1a5d43eca9bc3ffab1b5bc6e913cc2e87564814c2e20faf196ea1a0b0d1d774be6b86502cef3f1f7c2d25d7cb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stow-doc"

RDEPENDS:${PN} += "stow"

inherit rpm
