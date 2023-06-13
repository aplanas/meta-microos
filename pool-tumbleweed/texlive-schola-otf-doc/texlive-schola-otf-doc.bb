SUMMARY = "Documentation for texlive-schola-otf"
DESCRIPTION = "This package includes the documentation for texlive-schola-otf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn64734"

RPM_NAME = "texlive-schola-otf-doc-2023.201.0.0.01svn64734-53.1.noarch.rpm"
RPM_HASH = "c07b550ec722a7fe25b3f0e140bbb6b6123018ece9a129cb616325deef99a36ef1fa9f9e124306acd8ad0399327c23ff18bfc7773136f86ba8159b23e5ecbd5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schola-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
