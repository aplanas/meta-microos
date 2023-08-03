SUMMARY = "Documentation for texlive-libertine"
DESCRIPTION = "This package includes the documentation for texlive-libertine"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.5.3.0svn64359"

RPM_NAME = "texlive-libertine-doc-2023.209.5.3.0svn64359-55.1.noarch.rpm"
RPM_HASH = "112fbca89701c827bd8c042ee043af952c6214789c4b979940fe9fbc9dd36cdea3826aa4ab4a8066e95313cbb78a1ba0c58db75b321a6558d5161cc443f29bc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertine-doc"

RDEPENDS:${PN} += ""

inherit rpm
