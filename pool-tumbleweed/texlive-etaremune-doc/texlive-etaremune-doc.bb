SUMMARY = "Documentation for texlive-etaremune"
DESCRIPTION = "This package includes the documentation for texlive-etaremune"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-etaremune-doc-2023.201.1.2svn15878-52.1.noarch.rpm"
RPM_HASH = "70435d0477ac5ee9692173b0e92ec5308078f50cffed8bdfe080a10905ce110aafbe8318cd883b9cc12344a23148093b52ba698378647e27aa00b53272ad6cce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etaremune-doc"

RDEPENDS:${PN} += ""

inherit rpm
