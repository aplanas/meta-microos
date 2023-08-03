SUMMARY = "Documentation for texlive-latexcolors"
DESCRIPTION = "This package includes the documentation for texlive-latexcolors"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1asvn49888"

RPM_NAME = "texlive-latexcolors-doc-2023.209.0.0.1asvn49888-55.1.noarch.rpm"
RPM_HASH = "e1277f0fe77a06aeed6c1d3ce6086ea063637fb466b6e40921412a822fa2a13b86cd7d2c59624b88c35ff93490dff2ffc36e3e9479a194a9e8a731b2b0e76987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcolors-doc"

RDEPENDS:${PN} += ""

inherit rpm
