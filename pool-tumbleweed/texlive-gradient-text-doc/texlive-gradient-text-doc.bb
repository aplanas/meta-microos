SUMMARY = "Documentation for texlive-gradient-text"
DESCRIPTION = "This package includes the documentation for texlive-gradient-text"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65567"

RPM_NAME = "texlive-gradient-text-doc-2023.201.1.2svn65567-53.1.noarch.rpm"
RPM_HASH = "e3484e1fcac66dc373735d4ef68933bbb31f17ff5381cde574e3ae3ce8f85d46cffe7e669b985eb10b93cb5db8eec68e5840c132b8ad63ea21f8c6bc5329f853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradient-text-doc"

RDEPENDS:${PN} += ""

inherit rpm
