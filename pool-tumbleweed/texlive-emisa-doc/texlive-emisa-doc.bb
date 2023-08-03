SUMMARY = "Documentation for texlive-emisa"
DESCRIPTION = "This package includes the documentation for texlive-emisa"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.0svn60068"

RPM_NAME = "texlive-emisa-doc-2023.209.2.3.0svn60068-54.1.noarch.rpm"
RPM_HASH = "482e701a09620ff17bfe7e44dc0be44091e4e1e72bc2f710ade056fd3186cd31791046eabfdd25197bbfe8e22e767526455f6599879cb9b74650633b3a103e04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emisa-doc"

RDEPENDS:${PN} += ""

inherit rpm
