SUMMARY = "Documentation for texlive-carbohydrates"
DESCRIPTION = "This package includes the documentation for texlive-carbohydrates"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn39000"

RPM_NAME = "texlive-carbohydrates-doc-2023.201.0.0.1svn39000-52.1.noarch.rpm"
RPM_HASH = "f77fe60c6c847d49ee6874724c8c4e83b5892db93ab6409cf8980c0f26d014150857aa8012e0382bfcab704948d47e872cc5885c217acb6f624551c4de4ce18c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-carbohydrates-doc"

RDEPENDS:${PN} += ""

inherit rpm
