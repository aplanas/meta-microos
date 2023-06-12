SUMMARY = "Documentation for texlive-hep-math-font"
DESCRIPTION = "This package includes the documentation for texlive-hep-math-font"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64901"

RPM_NAME = "texlive-hep-math-font-doc-2023.201.1.1svn64901-53.1.noarch.rpm"
RPM_HASH = "1b5336041de55835fac9968e345cbe1be695d433ef8770e36aa24f94b36d4427f4491ac5e91170668de6c90ea6185a013e0bbf697ed7499010365db807c18b21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-math-font-doc"
RDEPENDS:${PN} += ""

inherit rpm
