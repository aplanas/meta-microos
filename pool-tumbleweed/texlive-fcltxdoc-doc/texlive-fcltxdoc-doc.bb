SUMMARY = "Documentation for texlive-fcltxdoc"
DESCRIPTION = "This package includes the documentation for texlive-fcltxdoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24500"

RPM_NAME = "texlive-fcltxdoc-doc-2023.209.1.0svn24500-53.1.noarch.rpm"
RPM_HASH = "6dea6e9b3619f0e570cf82a8cf5116a179ac5c5f926f1cd571b554efde97e2ca23c5df3b62b8e1ea304102560b21d09b41c3da9fb1f223a7d446596085b28211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fcltxdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
