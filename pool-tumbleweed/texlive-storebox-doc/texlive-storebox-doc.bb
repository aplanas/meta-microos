SUMMARY = "Documentation for texlive-storebox"
DESCRIPTION = "This package includes the documentation for texlive-storebox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3asvn64967"

RPM_NAME = "texlive-storebox-doc-2023.201.1.3asvn64967-57.1.noarch.rpm"
RPM_HASH = "d944202c2396a3c75045290f249934d1fa538aa5fb175aacaf1ad77883bacf95d413b7118573a1ab3d35beb95c97e20eee527efd2e475f306153e64df66ab281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-storebox-doc"
RDEPENDS:${PN} += ""

inherit rpm
