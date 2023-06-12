SUMMARY = "Documentation for texlive-xetex"
DESCRIPTION = "This package includes the documentation for texlive-xetex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66203"

RPM_NAME = "texlive-xetex-doc-2023.201.svn66203-52.1.noarch.rpm"
RPM_HASH = "5d388ea3c38c4698e31257c8c3e64716cbd7deffb6c81b41e0217c3d598b7ef10076a68e88e0080c19a9aa4f3e39300a5c4040f3f9eb2741712259bed90d9ef2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(xelatex-unsafe.1) \
man(xelatex.1) \
man(xetex-unsafe.1) \
man(xetex.1) \
texlive-xetex-doc"
RDEPENDS:${PN} += ""

inherit rpm
