SUMMARY = "Documentation for texlive-hpsdiss"
DESCRIPTION = "This package includes the documentation for texlive-hpsdiss"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-hpsdiss-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "633fb8a07f79895bb9af91aba7ab530b7dda1dedc8d2d79bda780777067d3f52ad6990edcaa28fed593245a6518e068bb4a942e044c8f81f7d4c26d9b5d809f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hpsdiss-doc"

RDEPENDS:${PN} += ""

inherit rpm
