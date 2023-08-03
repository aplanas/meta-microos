SUMMARY = "Documentation for texlive-sidenotes"
DESCRIPTION = "This package includes the documentation for texlive-sidenotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00asvn54524"

RPM_NAME = "texlive-sidenotes-doc-2023.209.1.00asvn54524-54.1.noarch.rpm"
RPM_HASH = "92588bbd6dedfbcf84065b24468c448890272843c5300d79b252ea8de1c284adc8225050859b4a867db85748f6e29ad60feb465e14739be1611633315b2158ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sidenotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
