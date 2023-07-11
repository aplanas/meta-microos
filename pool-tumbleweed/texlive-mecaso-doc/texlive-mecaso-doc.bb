SUMMARY = "Documentation for texlive-mecaso"
DESCRIPTION = "This package includes the documentation for texlive-mecaso"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.0svn60346"

RPM_NAME = "texlive-mecaso-doc-2023.208.1.0svn60346-53.1.noarch.rpm"
RPM_HASH = "3d6541908fbb0542ffeb0093a07a84a6339481391772fc727717ef09397ffd4977cb4c8dab36e84c4543f429bd46028bbbbedc9fcaa87dd33d70022062f9c8f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mecaso-doc-fr \
texlive-mecaso-doc"

RDEPENDS:${PN} += ""

inherit rpm
