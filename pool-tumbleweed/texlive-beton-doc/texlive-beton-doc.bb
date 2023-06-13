SUMMARY = "Documentation for texlive-beton"
DESCRIPTION = "This package includes the documentation for texlive-beton"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-beton-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "90300a42a249fc4346395a3f30a4f85f69ed973f928b71209339773b6e1897fc7f84020a18829c7450f27ebc48e1d34ebbdfc89f71bcc4e98cbf80e0cfd39a06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beton-doc"

RDEPENDS:${PN} += ""

inherit rpm
