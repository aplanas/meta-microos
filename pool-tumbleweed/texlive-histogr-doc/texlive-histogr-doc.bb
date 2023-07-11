SUMMARY = "Documentation for texlive-histogr"
DESCRIPTION = "This package includes the documentation for texlive-histogr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn15878"

RPM_NAME = "texlive-histogr-doc-2023.201.1.01svn15878-53.2.noarch.rpm"
RPM_HASH = "ced7dce64810201c73630dc433915b68de33fefce7a64b26cd3e89db6c117466427be31c40dd187c47aa199709605c1b85d138cd7f93c1c02a2073a5c78dd0f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-histogr-doc"

RDEPENDS:${PN} += ""

inherit rpm
