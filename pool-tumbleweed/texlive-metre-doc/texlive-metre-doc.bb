SUMMARY = "Documentation for texlive-metre"
DESCRIPTION = "This package includes the documentation for texlive-metre"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn18489"

RPM_NAME = "texlive-metre-doc-2023.201.1.0svn18489-54.1.noarch.rpm"
RPM_HASH = "f8018eea403acb8882323ef0b2d14a0d105c607f1299e6363789a77ef8441ed0f85eb9855b1706c16762feeffe4908179309b47a2c786af2f3b438fc0b981a23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metre-doc"
RDEPENDS:${PN} += ""

inherit rpm
