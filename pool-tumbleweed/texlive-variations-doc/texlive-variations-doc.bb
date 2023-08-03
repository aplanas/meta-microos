SUMMARY = "Documentation for texlive-variations"
DESCRIPTION = "This package includes the documentation for texlive-variations"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.3svn15878"

RPM_NAME = "texlive-variations-doc-2023.209.0.0.3svn15878-54.1.noarch.rpm"
RPM_HASH = "2ec68bbf32560026bd4e1db19266c321644b6b26375b374ba5e82424cd5015204097b462df5f0f65826241a599bc795dd0655ab60b73dbfaa8542b0dbb629c45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-variations-doc-fr;en \
texlive-variations-doc"

RDEPENDS:${PN} += ""

inherit rpm
