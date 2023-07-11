SUMMARY = "Documentation for texlive-ptolemaicastronomy"
DESCRIPTION = "This package includes the documentation for texlive-ptolemaicastronomy"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn50810"

RPM_NAME = "texlive-ptolemaicastronomy-doc-2023.201.1.0svn50810-53.2.noarch.rpm"
RPM_HASH = "70f6c1d3c1db5393551cee0f86b412c704a9d7757e268a3b9aa1ed9598c3af110a4a51409b0201e2c4e61decda3113bedb155be7e9aaed50b4ab7381c4eb55b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptolemaicastronomy-doc"

RDEPENDS:${PN} += ""

inherit rpm
