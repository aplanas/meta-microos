SUMMARY = "Documentation for texlive-cslatex"
DESCRIPTION = "This package includes the documentation for texlive-cslatex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-cslatex-doc-2023.209.svn66186-55.1.noarch.rpm"
RPM_HASH = "ea378181947017152eed8eb7d63aa548931bc949f4ad1a2b94e6f5b15a96d69f7616708d703a1ed65fecaf55d8b6cefe09a5f2499435748f4d813d87744da7cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-cslatex.1 \
man-pdfcslatex.1 \
texlive-cslatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
