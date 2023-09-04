SUMMARY = "Documentation for texlive-writeongrid"
DESCRIPTION = "This package includes the documentation for texlive-writeongrid"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.2svn65700"

RPM_NAME = "texlive-writeongrid-doc-2023.209.0.0.1.2svn65700-53.2.noarch.rpm"
RPM_HASH = "f428ac8aa5f1a23fccb3e3996a3e4e78370cb08572d4ab12e853bf80c2e7489f57c1cc6a8b203c91a3aa20624afecf443d63649b3b76a3f57c9c4182c058fc5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-writeongrid-doc-fr \
texlive-writeongrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
