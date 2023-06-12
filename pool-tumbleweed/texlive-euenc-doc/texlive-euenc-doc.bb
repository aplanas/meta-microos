SUMMARY = "Documentation for texlive-euenc"
DESCRIPTION = "This package includes the documentation for texlive-euenc"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1hsvn19795"

RPM_NAME = "texlive-euenc-doc-2023.201.0.0.1hsvn19795-52.1.noarch.rpm"
RPM_HASH = "c717cfd47be63bee869a4b88bf938da9a3b465e71261eb2013c630f5e2ab887fc75ed4c4d4e3e8ba59a96ba5644f811236dabca1de67cdfb6336056126c89a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euenc-doc"
RDEPENDS:${PN} += ""

inherit rpm
