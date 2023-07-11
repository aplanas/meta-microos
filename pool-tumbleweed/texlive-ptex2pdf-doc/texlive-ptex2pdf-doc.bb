SUMMARY = "Documentation for texlive-ptex2pdf"
DESCRIPTION = "This package includes the documentation for texlive-ptex2pdf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.20200520.0svn65953"

RPM_NAME = "texlive-ptex2pdf-doc-2023.201.20200520.0svn65953-53.2.noarch.rpm"
RPM_HASH = "a98e85d7fa11a5a0dda6bbfd090654ccfa160eab0efd60e55a34fe54453420d34c5d50e8e4eddfe131ae88724e30a8fe7b88e941574f3382968a8926f99d4264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex2pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
