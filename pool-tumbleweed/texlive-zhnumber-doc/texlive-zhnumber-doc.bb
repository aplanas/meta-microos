SUMMARY = "Documentation for texlive-zhnumber"
DESCRIPTION = "This package includes the documentation for texlive-zhnumber"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn66115"

RPM_NAME = "texlive-zhnumber-doc-2023.209.3.0svn66115-53.1.noarch.rpm"
RPM_HASH = "3dbb12ba0c73f52ed0ea1494c84bd01bd5098f1d6f88e2a275126c7eef6720004f26bd9a5c13ad8233f356edd7871675561feb1cf8935ef57fc649f4fc41c616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zhnumber-doc-zh \
texlive-zhnumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
