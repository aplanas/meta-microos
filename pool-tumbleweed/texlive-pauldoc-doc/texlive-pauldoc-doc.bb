SUMMARY = "Documentation for texlive-pauldoc"
DESCRIPTION = "This package includes the documentation for texlive-pauldoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn16005"

RPM_NAME = "texlive-pauldoc-doc-2023.201.0.0.5svn16005-51.1.noarch.rpm"
RPM_HASH = "839cc9983fbd0f1b62a6ad23e5cc5044d763edd7fab380d958639cf8ecfe96ddeceb4969be61756065005ab341be02b4f197df9fa04a99e451bcb4643c569dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pauldoc-doc-de \
texlive-pauldoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
