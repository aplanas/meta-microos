SUMMARY = "Documentation for texlive-pst-slpe"
DESCRIPTION = "This package includes the documentation for texlive-pst-slpe"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.31svn24391"

RPM_NAME = "texlive-pst-slpe-doc-2023.201.1.31svn24391-53.2.noarch.rpm"
RPM_HASH = "f35b74c78eecc337bfa8c8678d974c0d3600e7084418682b20cefa9af48188f52487d24124b4770e421de4e0f9dc5da02fb7c19ea644a89b07913f769a390747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-slpe-doc"

RDEPENDS:${PN} += ""

inherit rpm
