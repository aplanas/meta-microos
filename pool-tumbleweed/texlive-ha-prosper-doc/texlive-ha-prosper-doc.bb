SUMMARY = "Documentation for texlive-ha-prosper"
DESCRIPTION = "This package includes the documentation for texlive-ha-prosper"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.21svn59651"

RPM_NAME = "texlive-ha-prosper-doc-2023.201.4.21svn59651-53.1.noarch.rpm"
RPM_HASH = "b9d918c4803db6941cd24e40820ddd6cfabd8e0c3c5022ac6bb6e6bb8cded2645cf8b1d3ccab52d9391cb6a37628b7d098b88651567dd05f6088bf818e475107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ha-prosper-doc"
RDEPENDS:${PN} += ""

inherit rpm
