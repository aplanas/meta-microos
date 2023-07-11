SUMMARY = "Documentation for texlive-luaquotes"
DESCRIPTION = "This package includes the documentation for texlive-luaquotes"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.4.0svn65652"

RPM_NAME = "texlive-luaquotes-doc-2023.208.1.4.0svn65652-53.1.noarch.rpm"
RPM_HASH = "bf8264dc6ff8861867ac062492452fe2e58c930fef7413be1dbf1f8e935bb84d5db92f03793e89f70d1f641b65be82d3d038b7b0bb7c2a9f9f8688c0f3ef8ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaquotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
