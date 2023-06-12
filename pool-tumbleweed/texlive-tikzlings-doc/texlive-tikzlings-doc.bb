SUMMARY = "Documentation for texlive-tikzlings"
DESCRIPTION = "This package includes the documentation for texlive-tikzlings"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn63628"

RPM_NAME = "texlive-tikzlings-doc-2023.201.1.0svn63628-52.1.noarch.rpm"
RPM_HASH = "fc00ed702f172f45dcbedd45232bce9a892252aefca4f0a239ce447fb1332307c5c16095b5128ec1bdffc42f41ac5da3544f84b89f0fcf7779d02087901bc4fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzlings-doc"
RDEPENDS:${PN} += ""

inherit rpm
