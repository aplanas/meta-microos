SUMMARY = "Documentation for texlive-pst-calculate"
DESCRIPTION = "This package includes the documentation for texlive-pst-calculate"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn49817"

RPM_NAME = "texlive-pst-calculate-doc-2023.201.0.0.02svn49817-52.1.noarch.rpm"
RPM_HASH = "9c746a2b4fba8c18b6c475927814aa4ca856f487a166a6efbd8b06b3cfeafd27302d0b696c16fb83e8df8ee6903405b92dae34f2b8878ffc7651c157a97b3449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-calculate-doc"
RDEPENDS:${PN} += ""

inherit rpm
