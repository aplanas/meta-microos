SUMMARY = "Documentation for texlive-chordbox"
DESCRIPTION = "This package includes the documentation for texlive-chordbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51000"

RPM_NAME = "texlive-chordbox-doc-2023.209.1.0svn51000-54.1.noarch.rpm"
RPM_HASH = "c799de8b4a4b68ab476e0eab44a92fba63ad8ffd45506b37cec3af625d13e7ca7af0a6219e21eb89fd8b309e9fabe3408439096425deb3cbfbe679fa894a8b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chordbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
