SUMMARY = "Documentation for texlive-sty2dtx"
DESCRIPTION = "This package includes the documentation for texlive-sty2dtx"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.4svn64967"

RPM_NAME = "texlive-sty2dtx-doc-2023.209.2.4svn64967-58.1.noarch.rpm"
RPM_HASH = "3e416a4b68adc2ac1d64721a487129f792b9063e68a8889146449be74b88177a519c231541e758ed094d9fd3028923c20fba85f607d57caaedd751877cebaf5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-sty2dtx.1 \
texlive-sty2dtx-doc"

RDEPENDS:${PN} += ""

inherit rpm
