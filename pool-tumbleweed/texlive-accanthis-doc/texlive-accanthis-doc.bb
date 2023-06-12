SUMMARY = "Documentation for texlive-accanthis"
DESCRIPTION = "This package includes the documentation for texlive-accanthis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn64844"

RPM_NAME = "texlive-accanthis-doc-2023.201.svn64844-54.1.noarch.rpm"
RPM_HASH = "e10e3d2d6f135cf3b4619b601c5163653ad2e71d069a666186d22f9fd953da7619a2942b06a1734f1676f946a766178af2d97642320d68a3c87401853bb49519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-accanthis-doc:fr) \
texlive-accanthis-doc"
RDEPENDS:${PN} += ""

inherit rpm
