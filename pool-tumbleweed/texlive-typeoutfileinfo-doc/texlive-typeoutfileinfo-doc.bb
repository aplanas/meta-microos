SUMMARY = "Documentation for texlive-typeoutfileinfo"
DESCRIPTION = "This package includes the documentation for texlive-typeoutfileinfo"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.31svn29349"

RPM_NAME = "texlive-typeoutfileinfo-doc-2023.209.0.0.31svn29349-53.1.noarch.rpm"
RPM_HASH = "4ef07e08f5308553a464ef557f7606cac8d19775ebf258edf7f8da0e53fe6072a6767261cc944583d2cfce4c43612ba3d9bcb29a0d6904c9c9df6074f6b8e359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typeoutfileinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
