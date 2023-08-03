SUMMARY = "Documentation for texlive-webquiz"
DESCRIPTION = "This package includes the documentation for texlive-webquiz"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.5.2svn58808"

RPM_NAME = "texlive-webquiz-doc-2023.209.5.2svn58808-54.1.noarch.rpm"
RPM_HASH = "f4c93e34756fb0310fab4bffb8a7458a5793fce2cca0a1db45e03249bbf3de2b5976af7574b6a0416ff2827fd0559c102bbae59d1812c4e0f492a5fa6b1b2cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-webquiz.1 \
texlive-webquiz-doc"

RDEPENDS:${PN} += ""

inherit rpm
