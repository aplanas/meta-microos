SUMMARY = "Documentation for texlive-matapli"
DESCRIPTION = "This package includes the documentation for texlive-matapli"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2.0svn62632"

RPM_NAME = "texlive-matapli-doc-2023.208.1.2.0svn62632-53.1.noarch.rpm"
RPM_HASH = "c86cc736f4733c4fbd5867513de87a4300120e87413198829921e4f099aaf66b9111a9c78b326081230e40595d2ca6a0c06d9d566558294fdcce2a4859b8cade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-matapli-doc-fr \
texlive-matapli-doc"

RDEPENDS:${PN} += ""

inherit rpm
