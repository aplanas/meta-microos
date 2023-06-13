SUMMARY = "Documentation for texlive-cellprops"
DESCRIPTION = "This package includes the documentation for texlive-cellprops"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0svn57599"

RPM_NAME = "texlive-cellprops-doc-2023.201.2.0svn57599-52.1.noarch.rpm"
RPM_HASH = "6f4ec4c5e86e64651f6f1ee41a01dcb0486295d4bf83d51df1734ffa58cad3cb992b07d2162d3e58ca4e58255426b7affb039165970ee51052cf9167df2208e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cellprops-doc"

RDEPENDS:${PN} += ""

inherit rpm
