SUMMARY = "Documentation for texlive-wrapstuff"
DESCRIPTION = "This package includes the documentation for texlive-wrapstuff"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn64058"

RPM_NAME = "texlive-wrapstuff-doc-2023.201.0.0.3svn64058-52.2.noarch.rpm"
RPM_HASH = "091b96fc3a7216401802b3b3d886680ceba29590808453f900a29ae153d55f271c9cdb280623b94fe462a8d583ea9865915490eec3087859a6377ad58566461e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-wrapstuff-doc-zh \
texlive-wrapstuff-doc"

RDEPENDS:${PN} += ""

inherit rpm
