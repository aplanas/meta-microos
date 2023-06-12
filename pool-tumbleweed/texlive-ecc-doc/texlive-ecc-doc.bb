SUMMARY = "Documentation for texlive-ecc"
DESCRIPTION = "This package includes the documentation for texlive-ecc"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-ecc-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "4836ae659b68446797443caf490e6080eac234d5e58f5f236923f9ee2faf769aa81b41bd35f8dea91f1791d7b826573fd86e4b823b351307b174021274c28f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecc-doc"
RDEPENDS:${PN} += ""

inherit rpm
