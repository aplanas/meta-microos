SUMMARY = "Documentation for texlive-xecjk"
DESCRIPTION = "This package includes the documentation for texlive-xecjk"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.9.1svn64059"

RPM_NAME = "texlive-xecjk-doc-2023.201.3.9.1svn64059-52.2.noarch.rpm"
RPM_HASH = "f39490519b5aded552f1ce38d3978dbb119e36b3fbcd44cb782e8c152b025912ac559feb38901f626fb0a2be0c7085d3de6892b36f4e49495b784a1e9b1882e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xecjk-doc-zh \
texlive-xecjk-doc"

RDEPENDS:${PN} += ""

inherit rpm
